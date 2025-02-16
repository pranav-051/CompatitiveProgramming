


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

    public ListNode oddEvenList(ListNode head) {
        ListNode mover = head.next;
        ListNode newLL = new ListNode(head.val);
        ListNode newLLPTR = newLL;
        ListNode evenPTR = newLLPTR; 
        int counter = 0; 

        while (mover != null)
        {
            if (counter % 2 != 0) {
                ListNode oddTemp = new ListNode(mover.val);
                newLLPTR.next = oddTemp;
                newLLPTR = oddTemp;
                evenPTR = evenPTR.next;
                System.out.println(oddTemp.val + "Counter val: " + counter);
            }
            counter++;
            mover = mover.next;
        }

        ListNode newMover = head.next;
        counter = 0; 
        while (newMover != null)
        {
            if (counter % 2 == 0)
            {
                ListNode evenTemp = new ListNode(newMover.val);
                evenPTR.next = evenTemp; 
                evenPTR = evenTemp; 
            }
            counter++;
            newMover = newMover.next; 
        }

        return newLL; 
    }

    public void traversal(ListNode head) {
        ListNode mover = head;
        while (mover != null) {
            System.out.print(mover.val + "  ");
            mover = mover.next;
        }
    }
}

public class odd_evenLL_328 {
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

        ListNode result = s.oddEvenList(head);
        System.out.print("Result: ");
        s.traversal(result);
    }
}


