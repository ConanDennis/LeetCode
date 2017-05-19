package LeetCode;

import java.util.Stack;


public class ImpQueueByStack_232 {
	public static void main(String[] args){
		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		
		while(!queue.empty()){
			System.out.println(queue.peek());
			queue.pop();
		}
	}
}

class MyQueue{
    //s1作为与队列同顺序的栈；s2作为与队列逆序的栈，作临时转换用
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        while (!s2.empty())   //按理说push只用把数放进容器就达到目的了，之所以还要有这个判定，是因为有可能前期调用了其他方法，如peek()，使得有些元素进到了s2还没有回到s1，导致下一步调用方法时结果错误
            s1.push(s2.pop());

        s1.push(x);

    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!s1.empty())
            s2.push(s1.pop());
   
        s2.pop();
    }

    // Get the front element.
    public int peek() {
        while(!s1.empty())
            s2.push(s1.pop());
        return s2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        while(!s1.empty())
            s2.push(s1.pop());
        return s2.empty();
    }
}