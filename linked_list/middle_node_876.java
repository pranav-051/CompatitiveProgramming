
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

    public ListNode middleNode(ListNode head) {
        ListNode mover = head;
        int length = 0;
        
        while (mover != null)
        {
            length++;
            mover = mover.next;
        }
    
        int middle = length / 2; 
        mover = head;
        int counter = 0;
        ListNode result = new ListNode(); 

        while (mover != null)
        {
            if (counter == middle) {
                result = new ListNode(mover.val);
                result.next = mover.next;
                break;
            }
            counter++;
            mover = mover.next;
        }
        
        return result;
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

public class middle_node_876 {

    public static void main(String[] args) {
        Solution s = new Solution();

        int arr[] = {10, 20, 30, 40, 50, 60};
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp; 
        }

        ListNode result = s.middleNode(head);
        s.traversal(result);
    }
}
