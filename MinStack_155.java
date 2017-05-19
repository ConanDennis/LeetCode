package LeetCode;

import java.util.Stack;

public class MinStack_155 {

}


//思想：要构造取最小值方法，关键不在调用时计算最小元素，而在于每次存取时记录好。
//采取的方法是，当有更小的数被push进来时，将上一次的min值先push进来，再将现在新的min值push进来，因此不担心min值被pop出后，找不到上一次记录的min值
class MinStack {
    Stack<Integer> stack=new Stack<>();
    
    int min=Integer.MAX_VALUE;
    
    public void push(int x) {
        if(x<=min) {
            stack.push(min); min=x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.peek()==min){ 
            stack.pop(); min=stack.pop(); 
        }
        else stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
