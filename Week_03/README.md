学习笔记

递归代码模版：

```java
public void recur(int level, int param) { 
    // terminator 递归终结条件
    if (level > MAX_LEVEL) { 
        // process result 
         return; 
    }
    
    // process current logic 处理当前层逻辑
    process(level, param); 

    // drill down 下探到下一层
    recur( level: level + 1, newParam); 
    
    // reverse the current level status if needed
}
```

思维要点：

1. 不要人肉递归
2. 找到最近最简方法，将其拆解成可重复解决的问题（重复子问题）
3. 数学归纳思维（当n=1,n=2是成立的，且n成立的时候，n+1也是成立的）

分治和回溯：

分治代码模版：

```python
# Python
def divide_conquer(problem, param1, param2, ...): 
  # recursion terminator 
  if problem is None: 
	print_result 
	return 
  # prepare data 
  data = prepare_data(problem) 
  subproblems = split_problem(problem, data) 
  # conquer subproblems 
  subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
  subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
  subresult3 = self.divide_conquer(subproblems[2], p1, ...) 
  …
  # process and generate the final result 
  result = process_result(subresult1, subresult2, subresult3, …)
	
  # revert the current level states
```

