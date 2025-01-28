
class Node {

    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null; 
    }
    Node(int d, Node n) {
        this.data = d;
        this.next = n; 
    }
}

class Solution {

    public void arrToLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}

class singly_LL {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Solution s = new Solution();
        s.arrToLL(arr);
    }
}
