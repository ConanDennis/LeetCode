package LeetCode;

public class RemoveDupFromSortList_83 {
	public static void main(String[] args){
		ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(3);
        ListNode five = new ListNode(3);
        
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;
        
        printLinkedList(one);
        
        removeDuplicates(one);
        
        printLinkedList(one);
		
	}
	
	public static ListNode removeDuplicates(ListNode head) {
        ListNode p = head;
        
        while(p != null){
            if(p.next != null){           //如果p之后还有结点，那么先比较p和p的下一个结点的值       	
                if(p.val == p.next.val)                //情况1：相等
                    p.next = p.next.next;			   //无论p的下一个的下一个是否存在，让p.next = p.next.next（当不存在时，p.next = null）
                else								   //情况2：不相等                									   	
                    p = p.next;						   //让p转移到下一个结点来
            }
            
            else                          //如果p之后没有结点了，那么就直接结束循环
                break ;
        }
        
        return head;
        
    }
	
	static void printLinkedList(ListNode head){
    	ListNode p = head;
    	
        while(p != null)
        {
            System.out.print(p.val + " ");
            p = p.next;
        }
        
        System.out.println();
    }
}
