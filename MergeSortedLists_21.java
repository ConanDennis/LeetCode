package LeetCode;

public class MergeSortedLists_21 {
	public static void main(String[] args){
		ListNode one = new ListNode(1);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(7);
        ListNode four = new ListNode(8);
        
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = null;
        
        printLinkedList(one);
        
        ListNode five = new ListNode(2);
        ListNode six = new ListNode(3);
        ListNode seven = new ListNode(5);
        ListNode eight = new ListNode(6);
        
        five.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = null;
        
        printLinkedList(five);

        ListNode newList = mergeTwoLists(one , five);
        
        printLinkedList(newList);
		
		
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1 , p2 = l2 , p3 , head;
       
        if(l1 == null && l2 != null)
            head = l2;

        else if(l2 == null && l1 != null)
            head = l1;

        else if(l1 == null && l2 ==null)
            head = null;

            
        else{
            if(p1.val < p2.val){
                head = p3 = p1;
                p1 = p1.next;
            }else{
                head = p3 = p2;
                p2 = p2.next;
            }
            
            while(p1 != null && p2 != null){           //采用归并排序思想
                if(p1.val < p2.val){
                    p3.next = p1;
                    p3 = p1;
                    p1 = p1.next;
                }else{
                    p3.next = p2;
                    p3 = p2;
                    p2 = p2.next;
                }
            }
            
            while(p1 != null){
                p3.next = p1;
                p3 =p1;
                p1 = p1.next; 
            }
            
            while(p2 != null){
                p3.next = p2;
                p3 = p2;
                p2 = p2.next;
            }
        }
        
        return head;
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
