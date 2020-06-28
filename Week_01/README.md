# Week01学习笔记：

## 学习总结: 

本周是算法训练营的第一周，主要讲解了算法的学习方法，包括Leetcode的使用方法和刷题技巧，还有一些常见的数据结构，如数组，链表，跳表，栈，队列，优先队列，双端队列等。

### 刷题方法：

每道题要过变数，五毒神掌，至少要刷5遍。

做题时要认真审题，思考全部解决方法，分析时间和空间复杂度。如果10分钟还想不出结果，直接看答案，参考别人的阶梯方法。然后写代码。最后寻求反馈，看自己的解题方法和别人的却别在哪里，还要去国际站看高评分的解题。

### 数据结构：

1. 数组(Array)是顺序存储，查询的时间复杂度为O(1)，插入和删除掉时间复杂度为O(n)；

2. 链表(linked list)是非顺序存储，查询的时间复杂度为O(n)，插入和删除的时间复杂度为O(1)；

3. 跳表(skip list)里的元素必须是有序的，查询，插入，删除的时间复杂度都为O(logn)。Redis和LevelDB都是用的跳表。

4. 栈(Stack)是一种后进先出(LIFO)的数据结构，查询的时间复杂度为O(n)，插入和删除的时间复杂度为O(1)。

   Stack的主要methods包括：

   | Modifier and Type | Method and Description                                       |
   | :---------------- | :----------------------------------------------------------- |
   | `boolean`         | `empty()`Tests if this stack is empty.                       |
   | `E`               | `peek()`Looks at the object at the top of this stack without removing it from the stack. |
   | `E`               | `pop()`Removes the object at the top of this stack and returns that object as the value of this function. |
   | `E`               | `push(E item)`Pushes an item onto the top of this stack.     |
   | `int`             | `search(Object o)`Returns the 1-based position where an object is on this stack. |

5. 队列(Queue)是一种先进先出(FIFO)的数据结构。查找的时间复杂度为O(n),增加删除的时间复杂度为O(1)。

   Queue的主要methods包括：

   | Modifier and Type | Method and Description                                       |
   | :---------------- | :----------------------------------------------------------- |
   | `boolean`         | `add(E e)`Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning `true` upon success and throwing an `IllegalStateException` if no space is currently available. |
   | `E`               | `element()`Retrieves, but does not remove, the head of this queue. |
   | `boolean`         | `offer(E e)`Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions. |
   | `E`               | `peek()`Retrieves, but does not remove, the head of this queue, or returns `null` if this queue is empty. |
   | `E`               | `poll()`Retrieves and removes the head of this queue, or returns `null` if this queue is empty. |
   | `E`               | `remove()`Retrieves and removes the head of this queue.      |

6. 双端队列(Deque)在实际工程中使用最多，查找的时间复杂度为O(n),增加删除的时间复杂度为O(1)。

   Deque的主要methods包括：

   | Modifier and Type | Method and Description                                       |
   | :---------------- | :----------------------------------------------------------- |
   | `boolean`         | `add(E e)`Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning `true` upon success and throwing an`IllegalStateException` if no space is currently available. |
   | `void`            | `addFirst(E e)`Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an `IllegalStateException` if no space is currently available. |
   | `void`            | `addLast(E e)`Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an `IllegalStateException` if no space is currently available. |
   | `boolean`         | `contains(Object o)`Returns `true` if this deque contains the specified element. |
   | `Iterator<E>`     | `descendingIterator()`Returns an iterator over the elements in this deque in reverse sequential order. |
   | `E`               | `element()`Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque). |
   | `E`               | `getFirst()`Retrieves, but does not remove, the first element of this deque. |
   | `E`               | `getLast()`Retrieves, but does not remove, the last element of this deque. |
   | `Iterator<E>`     | `iterator()`Returns an iterator over the elements in this deque in proper sequence. |
   | `boolean`         | `offer(E e)`Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning `true` upon success and `false` if no space is currently available. |
   | `boolean`         | `offerFirst(E e)`Inserts the specified element at the front of this deque unless it would violate capacity restrictions. |
   | `boolean`         | `offerLast(E e)`Inserts the specified element at the end of this deque unless it would violate capacity restrictions. |
   | `E`               | `peek()`Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns `null` if this deque is empty. |
   | `E`               | `peekFirst()`Retrieves, but does not remove, the first element of this deque, or returns `null` if this deque is empty. |
   | `E`               | `peekLast()`Retrieves, but does not remove, the last element of this deque, or returns `null` if this deque is empty. |
   | `E`               | `poll()`Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns `null` if this deque is empty. |
   | `E`               | `pollFirst()`Retrieves and removes the first element of this deque, or returns `null` if this deque is empty. |
   | `E`               | `pollLast()`Retrieves and removes the last element of this deque, or returns `null` if this deque is empty. |
   | `E`               | `pop()`Pops an element from the stack represented by this deque. |
   | `void`            | `push(E e)`Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an `IllegalStateException` if no space is currently available. |
   | `E`               | `remove()`Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque). |
   | `boolean`         | `remove(Object o)`Removes the first occurrence of the specified element from this deque. |
   | `E`               | `removeFirst()`Retrieves and removes the first element of this deque. |
   | `boolean`         | `removeFirstOccurrence(Object o)`Removes the first occurrence of the specified element from this deque. |
   | `E`               | `removeLast()`Retrieves and removes the last element of this deque. |
   | `boolean`         | `removeLastOccurrence(Object o)`Removes the last occurrence of the specified element from this deque. |
   | `int`             | `size()`Returns the number of elements in this deque.        |

7. 优先队列(PriorityQueue)，其底层实现是数组(Array)，其作用是将队列中元素最小值放到堆顶(小顶堆，最小的元素在顶端，也可以通过修改comparator，使之变成大顶堆，最大的元素在顶端)。

   时间复杂度：remove()方法和add()方法的时间复杂度为O(logn)，contains()方法时间复杂度为O(n)，取队头为O(1)。

   PriorityQueue的主要methods包括：

   | Modifier and Type       | Method and Description                                       |
   | :---------------------- | :----------------------------------------------------------- |
   | `boolean`               | `add(E e)`Inserts the specified element into this priority queue. |
   | `void`                  | `clear()`Removes all of the elements from this priority queue. |
   | `Comparator<? super E>` | `comparator()`Returns the comparator used to order the elements in this queue, or `null` if this queue is sorted according to the [natural ordering](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) of its elements. |
   | `boolean`               | `contains(Object o)`Returns `true` if this queue contains the specified element. |
   | `Iterator<E>`           | `iterator()`Returns an iterator over the elements in this queue. |
   | `boolean`               | `offer(E e)`Inserts the specified element into this priority queue. |
   | `E`                     | `peek()`Retrieves, but does not remove, the head of this queue, or returns `null` if this queue is empty. |
   | `E`                     | `poll()`Retrieves and removes the head of this queue, or returns `null` if this queue is empty. |
   | `boolean`               | `remove(Object o)`Removes a single instance of the specified element from this queue, if it is present. |
   | `int`                   | `size()`Returns the number of elements in this collection.   |
   | `Spliterator<E>`        | `spliterator()`Creates a *[late-binding](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html#binding)* and *fail-fast* [`Spliterator`](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html) over the elements in this queue. |
   | `Object[]`              | `toArray()`Returns an array containing all of the elements in this queue. |
   | `<T> T[]`               | `toArray(T[] a)`Returns an array containing all of the elements in this queue; the runtime type of the returned array is that of the specified array. |

### 个人总结：

对比老师的做题方法，本人之前的刷题方法确实有问题，死磕的次数比较多，这种方式在学生时期时间多的时候都很难坚持下来，更何况现在工作了，感觉死磕确实浪费精力，容易半途而废，且投入产出不成正比。

在加入算法集中营后，刷题效率确实有所提高，但是因为工作之后很久不学习了的原因，感觉自己的时间利用率并不是很高。由于本周休假，所以大部分题目都争取做到了一遍到两遍，当然也有部分难度大题目不能很好理解，还没有机会做。感觉老师说的题目过变数还是很重要的，以后会花更多时间在题目上。

争取后面的学习中能提高学习效率，以至于在工作忙的时候也能至少坚持现在的进度不掉队。

## PriorityQueue源码分析：

### 1. PriorityQueue的主要属性：

```java
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
```



### 2. PriorityQueue的Constructor：

根据参数和作用不同，PriorityQueue一共有七个构造函数，其中包括默认值的构造函数，
指定数组长度或比较器的构造函数，和针对不同object类型的复制构造函数等。

### 3. PriorityQueue增加capacity:

```java
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
private static int hugeCapacity(int minCapacity) {
    if (minCapacity < 0) // overflow,如果minCapacity overflow则抛出异常。
        throw new OutOfMemoryError();
    // 根据情况返回Integer.MAX_VALUE或MAX_ARRAY_SIZE
    return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
}
```



### 4. PriorityQueue插入元素：

通过调用public boolean add(E e)或public boolean offer(E e)来对PriorityQueue进行元素插入。

```java
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
```

### 5. ProrityQueue移除元素：

可以通过poll()方法移除顶端元素或removeAt(int i)方法移除任意元素。
两种方法都是用PriorityQueue的尾端元素代替移除元素，之后将原尾端元素设成null,
然后调用siftDown()将新替换元素下沉，或调用方法做siftUp()方法将新元素上浮，过程与插入节点类似。

### 6. PriorityQueue从Collection实现类中进行初始化：

通过调用initFromCollection(Collection<? extends E> c)方法来进行初始化。

```java
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
```

### 7. 总结：

PriorityQueue是继承了AbstractQueue，其底层是通过数组实现的。每次插入元素会放在堆尾，然后做上浮。删除元素时，
会用堆尾元素替换原来移除元素的位置，将原堆尾元素制空。然后再根据替换后的元素的进行下沉(siftDown)或上浮(siftUp)操作。
