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
	            set.add(p);        //将结点依次加入到Set中，每加入一次，count就加一，如果有重复元素加入，那么set的大小不会增加，但count还是会加1
	            count ++;			
	            
	            if(count != set.size())    //通过比较count和size就能知道有没有循环了
	                return true;
	                
	            p = p.next;
	            
	        }
	        
	        return false;
	    }
	
	/*巧妙解法
	 * 
	public boolean hasCycle(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;

	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;  //fast每次都比slow多进一个结点，如果fast能与slow遇见，说明有循环

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
