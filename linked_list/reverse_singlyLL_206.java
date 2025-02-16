 class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev forward
            curr = nextNode; // Move curr forward
        }

        return prev; // New head of the reversed list
    }
    
    public void traversal (ListNode head)
    {
        ListNode mover = head;  
        while (mover != null)
        {
            System.out.print(mover.val+" ");
            mover = mover.next; 
        }
    }
}

public class reverse_singlyLL_206 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head; 
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        
        Solution s = new Solution();
        ListNode newHead = s.reverseList(head);
        s.traversal(newHead);
    }
}
