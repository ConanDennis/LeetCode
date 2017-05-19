package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle_141 {
	public static void main(String[] args){
		ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(3);
        
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;
        
        printLinkedList(one);
        
        System.out.println(hasCycle(one));
		
	}
	
	 public static boolean hasCycle(ListNode head) {
	      
	        Set<ListNode> set = new HashSet<ListNode>();
	        int count = 0;
	        ListNode p = head;
	        while(p != null){
	            set.add(p);        //��������μ��뵽Set�У�ÿ����һ�Σ�count�ͼ�һ��������ظ�Ԫ�ؼ��룬��ôset�Ĵ�С�������ӣ���count���ǻ��1
	            count ++;			
	            
	            if(count != set.size())    //ͨ���Ƚ�count��size����֪����û��ѭ����
	                return true;
	                
	            p = p.next;
	            
	        }
	        
	        return false;
	    }
	
	/*����ⷨ
	 * 
	public boolean hasCycle(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;

	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;  //fastÿ�ζ���slow���һ����㣬���fast����slow������˵����ѭ��

	            if(slow == fast){ //If they meet at same node, there is a cycle
	                return true;
	            }
	        }

	        return false;
	    }
	    */
	
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
