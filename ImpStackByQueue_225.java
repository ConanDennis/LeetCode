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
	
//˼���232����һ���ģ����ǹ����������У�����һ����Ϊ��ʱ�洢�������ã��Ա��ڵ�ʵ�ֹ��ܵĹ����У�����Ԫ�ؿ��Ա���������
//��˼·�����е�ÿ�ַ�����󶼰�����Ԫ�ش���q2�У�����Ҫ���仯ʱ����q1��Ϊ��ʱ�洢�������������Ԫ��ֻ��Ҫ�ӵ�q2�У�����ջ�Ƿ�Ϊ��Ҳֻ��Ҫ��q2
class MyStack {
    Queue<Integer> q1 = new ArrayDeque<Integer>();    //��Ҫע����ǣ�Queue��Stack����ͬ������һ�������ӿڣ���List��Set��һ���ģ�����һ��Ҫnew��һ��ʵ����
    Queue<Integer> q2 = new ArrayDeque<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        q2.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        while(!q2.isEmpty())           //Queue�ӿڵĸ��ӿ���Collection���������̳���Collection��isEmoty()��size()����
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