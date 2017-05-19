package LeetCode;

public class SwapNodesInPairs_24 {
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
        
        ListNode head = swapPairs(one);
        printLinkedList(head);
	}
	
	public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)         //当传进来的结点为空，或只有一个结点，那么无需进行关系交换
            return head;
            
        else if(head !=null && head.next != null && head.next.next == null){      //当传进来的链表有两个结点，那么只需将这两个结点关系倒过来一下就行
            ListNode p;
            p = head.next;
            p.next = head;
            head.next = null;
            return p;
        }
        
        else{
            ListNode p1 , p2 , p3;        //建三个指针，分别指向前三个结点
            p1 = head;
            p2 = p1.next;
            p3 = p2.next;
            
            p2.next = p1;				 //按要求完成前三个结点的关系交换后，顺序变为p2->p1->p3
            p1.next = p3;
            
            p1.next = swapPairs(p3);	 //再进行下一组结点关系交换，以p3为head进行递归，别忘了递归的结果要与前面排好的结点连接起来！！
            
            return p2;                   //p2是结点关系交换后的头部
        }  
        
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
