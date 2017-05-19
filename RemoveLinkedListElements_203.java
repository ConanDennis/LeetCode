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
                      
        while(head.val == val){     //��Ҫ���������ͷ������val���������ɾ�����ǵ�ͬʱ����֤����������ͷ����ֵ����val
            head = head.next;
            if(head == null)
                return null;
        }
        
        ListNode p1 = head , p2 = head;       //��ʼ��p1��p2������head�ǿ���ֵ����val������p1��p2һ���Ƿǿյ�
        while(p1.next != null){
            p1 = p1.next;           //p1����һ�������ݺ���Ľ��ֵ�Ƿ�val�����������
            if(p1.val == val){      //1��p1ֵΪval
                while(p1.next != null && p1.next.val == val)    //Ҫ�����������ֶ��val���������p1���������һ��ֵΪval�Ľ�㴦
                    p1 = p1.next;
                
                if(p1.next != null){          //���p1����Ľ�㲻Ϊ�գ���ôӦ�ý�p1��������һ����Ȼ���ǰ���p2��p1��������
                    p1 = p1.next;
                    p2.next = p1;
                    p2 = p1;
                }
                else p2.next = null;          //���p1����Ľ��Ϊ�գ���ô���Խ�p2��Ľ�㶪��
            }
            else p2 = p1;           //2��p1ֵ��Ϊval��������������һ��
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
