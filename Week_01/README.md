## 学习笔记: 



## PriorityQueue源码分析：

### 1. PriorityQueue的主要属性：

//数组的默认初始化长度
private static final int DEFAULT_INITIAL_CAPACITY = 11;

//用来实现堆的数组
transient Object[] queue;

//PriorityQueue的size
private int size = 0;

//PriorityQueue的比较器
private final Comparator<? super E> comparator;

//PriorityQueue被结构化调整的次数
transient int modCount = 0;

### 2. PriorityQueue的Constructor：

根据参数和作用不同，PriorityQueue一共有七个构造函数，其中包括默认值的构造函数，
指定数组长度或比较器的构造函数，和针对不同object类型的复制构造函数等。

### 3. PriorityQueue增加capacity:

private void grow(int minCapacity) {
			int oldCapacity = queue.length;
			// Double size if small; else grow by 50%
			// 如果oldCapacity < 64，扩大为原来的2倍，否则扩大原来的一半
			int newCapacity = oldCapacity + ((oldCapacity < 64) ? (oldCapacity + 2) : (oldCapacity >> 1));
			// overflow-conscious code
			// 如果newCapacity超过了最大值MAX_ARRAY_SIZE，则调用hugeCapacity方法
			if (newCapacity - MAX_ARRAY_SIZE > 0)
			newCapacity = hugeCapacity(minCapacity);
	    queue = Arrays.copyOf(queue, newCapacity);
	}

```
private static int hugeCapacity(int minCapacity) {
		if (minCapacity < 0) // overflow,如果minCapacity overflow则抛出异常。
				throw new OutOfMemoryError();
		// 根据情况返回Integer.MAX_VALUE或MAX_ARRAY_SIZE
		return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
}
```
### 4. PriorityQueue插入元素：

通过调用public boolean add(E e)或public boolean offer(E e)来对PriorityQueue进行元素插入。

	public boolean add(E e) {
				return offer(e);
	}
	
	public boolean offer(E e) {
			if (e == null)
					throw new NullPointerException();
			modCount++;
			int i = size;
			// 如果需要扩容，则调用grow()。
			if (i >= queue.length)
					grow(i + 1);
			size = i + 1;
			// 如果此前size为0，则说明原本没有element，所以新插入的element会放在顶堆，不需要调整。
			if (i == 0)
					queue[0] = e;
			else
			// 否则调用sifitUp()方法，将新element插入queue[i]，然后调整PriorityQueue，上浮插入元素。
					siftUp(i, e);
			return true;
	}
	
	private void siftUp(int k, E x) {
			// 如果comparator不为空，则使用comparator进行调整，否则用element实现的comparable接口进行调整
	    if (comparator != null)
	        siftUpUsingComparator(k, x);
	    else
	        siftUpComparable(k, x);
	}
	
		//用element实现的comparable接口进行上浮
	private void siftUpComparable(int k, E x) {
				// 此时k为PriorityQueue的尾端
	    Comparable<? super E> key = (Comparable<? super E>) x;
	    while (k > 0) {
	    		// 计算当前插入位置父节点的下标
	        int parent = (k - 1) >>> 1;
	        Object e = queue[parent];
	        // 如果父节点小于插入节点，则停止上浮
	        if (key.compareTo((E) e) >= 0)
	            break;
	        // 否则将父节点放入queue[k]，并将k赋值为父节点的下标，继续上浮
	        queue[k] = e;
	        k = parent;
	    }
	    // 退出循环后，将新的element插入到得到的queue[k]的位置。
	    queue[k] = key;
	}
	
	//用PriorityQueue的Comparator进行上浮，过程与siftUpComparable一致
	private void siftUpUsingComparator(int k, E x) {
	    while (k > 0) {
	        int parent = (k - 1) >>> 1;
	        Object e = queue[parent];
	        if (comparator.compare(x, (E) e) >= 0)
	            break;
	        queue[k] = e;
	        k = parent;
	    }
	    queue[k] = x;
	}

### 5. ProrityQueue移除元素：

可以通过poll()方法移除顶端元素或removeAt(int i)方法移除任意元素。
两种方法都是用PriorityQueue的尾端元素代替移除元素，之后将原尾端元素设成null,
然后调用siftDown()将新替换元素下沉，或调用方法做siftUp()方法将新元素上浮，过程与插入节点类似。

### 6. PriorityQueue从Collection实现类中进行初始化：

通过调用initFromCollection(Collection<? extends E> c)方法来进行初始化。

	private void initFromCollection(Collection<? extends E> c) {
				// 提取Collection中的元素
	    initElementsFromCollection(c);
	    // 对PriorityQueue进行调整
	    heapify();
	}
	
	private void initElementsFromCollection(Collection<? extends E> c) {
	    Object[] a = c.toArray();
	    // If c.toArray incorrectly doesn't return Object[], copy it.
	    if (a.getClass() != Object[].class)
	        a = Arrays.copyOf(a, a.length, Object[].class);
	    // 检查是否有null存在
	    int len = a.length;
	    if (len == 1 || this.comparator != null)
	        for (int i = 0; i < len; i++)
	            if (a[i] == null)
	                throw new NullPointerException();
	    // 修改this对像的queue引用和size大小
	    this.queue = a;
	    this.size = a.length;
	}
	
	//整体调整PriorityQueue
	@SuppressWarnings("unchecked")
	private void heapify() {
			// 从底往上，对每个有自节点对元素进行下沉操作。
	    for (int i = (size >>> 1) - 1; i >= 0; i--)
	        siftDown(i, (E) queue[i]);
	}

### 7. 总结：

PriorityQueue是继承了AbstractQueue，其底层是通过数组实现的。每次插入元素会放在堆尾，然后做上浮。删除元素时，
会用堆尾元素替换原来移除元素的位置，将原堆尾元素制空。然后再根据替换后的元素的进行下沉(siftDown)或上浮(siftUp)操作。
