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
    //s1��Ϊ�����ͬ˳���ջ��s2��Ϊ����������ջ������ʱת����
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        while (!s2.empty())   //����˵pushֻ�ð����Ž������ʹﵽĿ���ˣ�֮���Ի�Ҫ������ж�������Ϊ�п���ǰ�ڵ�����������������peek()��ʹ����ЩԪ�ؽ�����s2��û�лص�s1��������һ�����÷���ʱ�������
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