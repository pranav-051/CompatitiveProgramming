
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
         this.val = x;
         this.next = null;
    }
 }

 class Solution {

     public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
         boolean containsLoop = false; 
        int size = 0;
        
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("jjjj");
                containsLoop = true;

                ListNode mover = slow;
                mover = mover.next; 
                while (mover != slow) {
                    mover = mover.next;
                    System.out.println("edfwr");
                    size++;
                }
                return true;
            }
        }
        System.out.println("Size: "+size);

        return false;
    }
    
    public void traversal (ListNode head)
    {
        ListNode mover = head;
        while (mover != null)
        {
            System.out.print(mover.val+"  ");
            mover = mover.next;
        }
    }
}

class list_cycle_141 {
    public static void main(String[] args) {
      
        int arr[] = {25, 14, 19, 33, 10, 21, 39, 90, 58, 45};

        ListNode head = new ListNode(arr[0]);
        ListNode mover = head; 

        for (int i=1; i<arr.length; i++)
        {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        Solution s = new Solution();
        s.traversal(head);
        
        System.out.println("\nResult: "+ s.hasCycle(head));
    }
}
