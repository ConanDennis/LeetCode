package LeetCode;

/* 237ÌâÖÐÒÑÐ´class ListNode
 * 
 * class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}*/

public class ReverseLinkedList_206 {
	public static void main(String[] args){
		ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = null;
        printLinkedList(one);
        
        ListNode feet = reverseList(one);
        printLinkedList(feet);
	}
    public static ListNode reverseList(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        
        int count = 1;
        while(p1.next != null){
            count ++;
            p1 = p1.next;
        }
        ListNode feet = p1;
        
        int a;
        while(count > 1){
            a = count - 2;
            while(a != 0){
            	a --;
            	p2 = p2.next;
            }
            p1.next = p2;
            p1 = p2;
            p2 = head;
            count --;
        }
        p1.next = null;
        
        return feet;
        
    }
    
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