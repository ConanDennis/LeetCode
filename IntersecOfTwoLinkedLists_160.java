package LeetCode;

public class IntersecOfTwoLinkedLists_160 {
	public static void main(String[] args){
		ListNode zero = new ListNode(0);
		ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        
        zero.next = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = null;
        printLinkedList(zero);
        
        
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        printLinkedList(a);
        

        printLinkedList(getIntersectionNode(zero,a));
		
	}
	
	//��ó��غϵĲ��֣�����ȻҪ��ĩβ��ʼ�Ƚ�
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null)
            return null;
        
        int lenA = 1 , lenB = 1;
        ListNode pA1 = headA , pA2 = headA , pB1 = headB , pB2 = headB;
        //����ѭ������֮��lenA�õ�A����ĳ��ȣ�lenB�õ�B����ĳ��ȣ�pA2ָ��ָ��A����ĩβ��pB2ָ��B����ĩβ
        while(pA2 != null && pA2.next!= null){
            lenA ++;      
            pA2 = pA2.next;
        }
        while(pB2 != null && pB2.next!= null){
            lenB ++;
            pB2 = pB2.next;
        }
        
        //�ȱȽ������������һ����㣬�������ȣ���ô�������ٱȽ��ˡ���֮�������ȣ���ôpA2��pB2�ͳ����غϲ��ֵ�ͷ
        if(pA2.val != pB2.val)
            return null;
        
        //��ĩβ��ȵ�����£����αȽ�������ǰһ�����
        while(lenA>1 && lenB >1){
            int count = 0;            //count��Ϊһ���Ʋ���
            //*֮����Ҫ��һ��lenA!=2,����ΪҪ���ǵ����Ƚϵ�lenA=2ʱ��Ҳ����A�������ٴӵڶ�����㿪ʼ����B�������غϲ��֣�����������Ƚ�A�����ͷ���������ʱ���Ӵ˾䣬����while�ж�pA1���headA���ߵ��ڶ�����㴦����������Զ��ˡ�Ϊ�˱������������������Ҫ��lenA=2ʱ���е�������Ҳ������pA1ͣ����headA�� ��Ҳ���ǲ�ִ���������伴��
            while(pA1 != null && lenA!=2){  
            	pA1 = pA1.next;       //ÿ�ζ���pA1��ǰ������
                count ++;
                if(count >= lenA-2)   //��pA1�ߵ�����Ҫ�ȽϵĽ��ʱ������A�����е�ָ���߶�
                    break;
            }
            
            count = 0;                //ͬ��
            while(pB1 != null && lenB!=2){
                pB1 = pB1.next;
                count ++;
                if(count >= lenB-2)
                    break;
            }
            
            if(pA1.val == pB1.val){    //pA1��pA2ָ�붼�Ѿ��ߵ�Ҫ�ȽϵĽ�㴦�����������ȣ���ô�غϲ��ֵ�ͷ��pA2����ΪpA1�������ڵ�λ��
                pA2 = pA1;
                
                pA1 = headA;           //pA1��pB1�ع鵽����ͷ���Ա���һ��ѭ��
                pB1 = headB;
            }else            
                return pA2;            //�������ȣ���ô�غϲ��ֵ�ͷ����֮ǰ��pA2��λ�ã����ؼ���
            
            lenA --;                   //ÿѭ��һ�ν������ȼ�һ�������һλ���ӣ���Ϊ��ִ�е�����˵�����һλ��ȣ���Ҫ�����Ƚ�ǰ��һ����㣩
            lenB --;  	
        }
            
        return pA2;
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
