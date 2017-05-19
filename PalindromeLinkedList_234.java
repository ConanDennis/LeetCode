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
        while(p != null){        //要判断回文，我就先把所有结点取出来放到list中，然后就从收尾到中间开始比较
            l1.add(p);
            p = p.next;
        }
        
        for(int i=0,j=l1.size()-1; i<=j; i++,j--){
            if(l1.get(i).val != l1.get(j).val)
                return false;
        }
        
        return true;    
    }
	
	 //另外一种用时更少的思路，找到中间结点，然后将从中间结点到尾结点的链表反过来，然后与原链表的前半段作比较。以上三个步骤可分别写三个方法
	
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
