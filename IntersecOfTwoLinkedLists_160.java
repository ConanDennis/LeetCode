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
	
	//想得出重合的部分，很显然要从末尾开始比较
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null)
            return null;
        
        int lenA = 1 , lenB = 1;
        ListNode pA1 = headA , pA2 = headA , pB1 = headB , pB2 = headB;
        //两个循环结束之后，lenA得到A链表的长度，lenB得到B链表的长度，pA2指针指向A链表末尾，pB2指向B链表末尾
        while(pA2 != null && pA2.next!= null){
            lenA ++;      
            pA2 = pA2.next;
        }
        while(pB2 != null && pB2.next!= null){
            lenB ++;
            pB2 = pB2.next;
        }
        
        //先比较两个链表最后一个结点，如果不相等，那么就无需再比较了。反之，如果相等，那么pA2和pB2就成了重合部分的头
        if(pA2.val != pB2.val)
            return null;
        
        //在末尾相等的情况下，依次比较俩链表前一个结点
        while(lenA>1 && lenB >1){
            int count = 0;            //count作为一个计步器
            //*之所以要加一个lenA!=2,是因为要考虑到当比较到lenA=2时，也就是A链表至少从第二个结点开始都与B链表有重合部分，接下来还需比较A链表的头，但如果此时不加此句，经过while判定pA1会从headA处走到第二个结点处，而且是永远如此。为了避免这种情况，我们需要对lenA=2时进行单独处理，也就是让pA1停留在headA处 ，也就是不执行下面的语句即可
            while(pA1 != null && lenA!=2){  
            	pA1 = pA1.next;       //每次都让pA1从前往后走
                count ++;
                if(count >= lenA-2)   //当pA1走到后面要比较的结点时，结束A链表中的指针走动
                    break;
            }
            
            count = 0;                //同理
            while(pB1 != null && lenB!=2){
                pB1 = pB1.next;
                count ++;
                if(count >= lenB-2)
                    break;
            }
            
            if(pA1.val == pB1.val){    //pA1和pA2指针都已经走到要比较的结点处，如果它们相等，那么重合部分的头（pA2）变为pA1现在所在的位置
                pA2 = pA1;
                
                pA1 = headA;           //pA1和pB1回归到链表头，以便下一次循环
                pB1 = headB;
            }else            
                return pA2;            //如果不相等，那么重合部分的头还是之前的pA2的位置，返回即可
            
            lenA --;                   //每循环一次将链表长度减一（将最后一位忽视，因为能执行到这里说明最后一位相等，需要继续比较前面一个结点）
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
