package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList_234 {
	public static void main(String[] args){
		ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(1);
        
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = null;
        printLinkedList(one);
        
        System.out.println(isPalindrome(one));
		
	}
	
	public static boolean isPalindrome(ListNode head) {
        List<ListNode> l1 = new ArrayList<ListNode>();
        ListNode p = head;
        while(p != null){        //Ҫ�жϻ��ģ��Ҿ��Ȱ����н��ȡ�����ŵ�list�У�Ȼ��ʹ���β���м俪ʼ�Ƚ�
            l1.add(p);
            p = p.next;
        }
        
        for(int i=0,j=l1.size()-1; i<=j; i++,j--){
            if(l1.get(i).val != l1.get(j).val)
                return false;
        }
        
        return true;    
    }
	
	 //����һ����ʱ���ٵ�˼·���ҵ��м��㣬Ȼ�󽫴��м��㵽β��������������Ȼ����ԭ�����ǰ������Ƚϡ�������������ɷֱ�д��������
	
	static void printLinkedList(ListNode head){
    	ListNode p = new ListNode(0);
    	p = head;
    	
        while(p != null)
        {
            System.out.print(p.val + " ");
            p = p.next;
        }
        
        System.out.println();
    }
}
