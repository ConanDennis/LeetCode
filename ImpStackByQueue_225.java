package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class ImpStackByQueue_225 {
	public static void main(String[] args){
		MyStack ms = new MyStack();
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		
		while(!ms.empty()){
			System.out.println(ms.top());
			ms.pop();
		}
	}
}
	
//思想和232题是一样的，就是构造两个队列，其中一个作为临时存储的容器用，以便在的实现功能的过程中，其他元素可以保留在其中
//本思路是类中的每种方法最后都把所有元素存在q2中，在需要做变化时，将q1作为临时存储容器。所以添加元素只需要加到q2中，考察栈是否为空也只需要看q2
class MyStack {
    Queue<Integer> q1 = new ArrayDeque<Integer>();    //需要注意的是，Queue与Stack并不同，它是一个容器接口，和List、Set是一样的，所以一定要new出一个实现类
    Queue<Integer> q2 = new ArrayDeque<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        q2.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        while(!q2.isEmpty())           //Queue接口的父接口是Collection，所以它继承了Collection的isEmoty()和size()方法
            q1.add(q2.remove());
        
        while(q1.size() != 1)
            q2.add(q1.remove());
        q1.remove();
    }

    // Get the top element.
    public int top() {
        while(!q2.isEmpty())
            q1.add(q2.remove());
            
        while(q1.size() != 1)
            q2.add(q1.remove());
        q2.add(q1.peek());
        return q1.remove();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q2.isEmpty();         
    }
}