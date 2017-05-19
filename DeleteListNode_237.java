package LeetCode;

class ListNode {
	int val;
	ListNode next;
    ListNode(int x) { val = x; }
}

public class DeleteListNode_237 {
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
        
        new DeleteListNode_237().deleteNode(three);
        
        printLinkedList(one);
    }
    
    public void deleteNode(ListNode node) {
     
        if (node.next == null) {
           node = null;
        }
    
        node.val = node.next.val;
        node.next = node.next.next;

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