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
            if(p.next != null){           //���p֮���н�㣬��ô�ȱȽ�p��p����һ������ֵ       	
                if(p.val == p.next.val)                //���1�����
                    p.next = p.next.next;			   //����p����һ������һ���Ƿ���ڣ���p.next = p.next.next����������ʱ��p.next = null��
                else								   //���2�������                									   	
                    p = p.next;						   //��pת�Ƶ���һ�������
            }
            
            else                          //���p֮��û�н���ˣ���ô��ֱ�ӽ���ѭ��
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
