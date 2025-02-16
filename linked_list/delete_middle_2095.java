

class ListNode {

    int val;
    ListNode next;

    public ListNode() {
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

    public int findMiddle (int size)
    {
        return( size / 2); 
    }

    public ListNode deleteMiddle(ListNode head) {

        ListNode mover = head;
        int counter = 0; 
        while (mover != null)
        {
            counter++;
            mover = mover.next;
        }
        
        ListNode newMover = head;
        int newCounter = 0;
        while (newMover != null)
        {
            if (newCounter == findMiddle(counter)) {
                //System.out.println("to be delete Node: " + newMover.val);
                if (newMover.next == null)
                {
                    ListNode temp = new ListNode(); 
                    newMover = temp;
                } else
                {
                    ListNode temp = new ListNode(newMover.next.val, newMover.next.next); 
                    newMover = temp; 
                }
                break;
            }
            newCounter++;
        }

        return head;
    }
    
    public void traversal(ListNode head) {
        ListNode mover = head;
        while (mover != null) {
            System.out.print(mover.val + "  ");
            mover = mover.next;
        }
    }
}

public class delete_middle_2095 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int arr[] = {2, 1};
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        ListNode newHead = new ListNode();
        newHead = s.deleteMiddle(head); 
        System.out.print("\n New Linked list: ");
        s.traversal(newHead);
    }
}


/*public ListNode deleteMiddle(ListNode head) {
    if (head == null || head.next == null) {
        return null;
    }

    ListNode prev = null;
    ListNode slow = head;
    ListNode fast = head;

    // Move `slow` to the middle, while `fast` moves twice as fast
    while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    // `slow` is at the middle node, remove it
    prev.next = slow.next;

    return head;
}
 */