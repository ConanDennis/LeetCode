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
        if(head == null || head.next == null)         //���������Ľ��Ϊ�գ���ֻ��һ����㣬��ô������й�ϵ����
            return head;
            
        else if(head !=null && head.next != null && head.next.next == null){      //����������������������㣬��ôֻ�轫����������ϵ������һ�¾���
            ListNode p;
            p = head.next;
            p.next = head;
            head.next = null;
            return p;
        }
        
        else{
            ListNode p1 , p2 , p3;        //������ָ�룬�ֱ�ָ��ǰ�������
            p1 = head;
            p2 = p1.next;
            p3 = p2.next;
            
            p2.next = p1;				 //��Ҫ�����ǰ�������Ĺ�ϵ������˳���Ϊp2->p1->p3
            p1.next = p3;
            
            p1.next = swapPairs(p3);	 //�ٽ�����һ�����ϵ��������p3Ϊhead���еݹ飬�����˵ݹ�Ľ��Ҫ��ǰ���źõĽ��������������
            
            return p2;                   //p2�ǽ���ϵ�������ͷ��
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
