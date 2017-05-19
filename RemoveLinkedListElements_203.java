package LeetCode;

public class RemoveLinkedListElements_203 {
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
        
        removeElements(one,2);
        printLinkedList(one);
		
	}
	
	public static ListNode removeElements(ListNode head, int val) {
		if(head == null)
            return null;
                      
        while(head.val == val){     //先要考虑链表的头部等于val的情况，在删除它们的同时，保证经过调整后头部的值不是val
            head = head.next;
            if(head == null)
                return null;
        }
        
        ListNode p1 = head , p2 = head;       //初始化p1、p2，由于head非空且值不是val，所以p1和p2一定是非空的
        while(p1.next != null){
            p1 = p1.next;           //p1先走一步，根据后面的结点值是否val，分两种情况
            if(p1.val == val){      //1、p1值为val
                while(p1.next != null && p1.next.val == val)    //要考虑连续出现多次val的情况，将p1调整到最后一个值为val的结点处
                    p1 = p1.next;
                
                if(p1.next != null){          //如果p1后面的结点不为空，那么应该将p1再往下走一个，然后把前面的p2和p1连接起来
                    p1 = p1.next;
                    p2.next = p1;
                    p2 = p1;
                }
                else p2.next = null;          //如果p1后面的结点为空，那么可以将p2后的结点丢弃
            }
            else p2 = p1;           //2、p1值不为val，可正常往后走一步
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
