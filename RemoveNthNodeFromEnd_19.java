package LeetCode;

public class RemoveNthNodeFromEnd_19 {
	public static void main(String[] args){
		ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;
        
        printLinkedList(one);
   
        printLinkedList(removeNthFromEnd(one , 2));
		
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int count = 0;
        while(p != null){
            p = p.next;
            count ++;
        }
        
        p = head;
        if(n == count)                 //删除头结点
            return head.next;
        else if(n == 1 && n!=count){   //删除尾结点，但排除头尾一致的情况
            int c = 1;
            while(p.next != null){
                if(c == count-n)
                    break;
                p = p.next;
                c ++;
            }
            p.next = null;
        }
        else{                          //删除的结点既不是头，也不是尾
            int d = 1;
            while(p.next != null){
                if(d == count-n)
                    break;
                p = p.next;
                d ++;
            }
            p.next = p.next.next;
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
