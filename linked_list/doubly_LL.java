
class Node {

    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Sample {

    public void traversal(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public Node arrToDoublyLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover.next.prev = mover;
            mover = temp;
        }
        return head;
    }

    public Node insertFirst(Node head, int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head.prev = newHead;
        return newHead;
    }

    public Node insertLast(Node head, int data) {
        Node temp = new Node(data);
        Node mover = head;

        while (mover != null) {
            if (mover.next == null) {
                mover.next = temp;
                temp.prev = mover;
                break;
            }
            mover = mover.next;
        }
        return head;
    }

    public Node deleteFirst(Node head) {
        Node newHead = head.next;
        newHead.prev = null;
        return newHead;
    }

    public Node deleteLast(Node head) {
        Node newHead = head;
        while (head != null) {
            if (head.next.next == null) {
                head.next = null;
                break;
            }
            head = head.next;
        }
        return newHead;
    }

    public Node insertAfter(Node head, int key, int data) {
        Node mover = head;
        Node temp = new Node(data);

        while (mover != null) {
            if (mover.data == key) {
                temp.next = mover.next;
                mover.next = temp;
                temp.prev = mover;
                break;
            }
            mover = mover.next;
        }
        return head;
    }

    public Node deleteAfter(Node head, int key) {
        Node mover = head;

        while (mover != null) {
            if (mover.data == key) {
                mover.next = mover.next.next;
                mover.next.next.prev = mover;
                break;
            }
            mover = mover.next;
        }
        return head;
    }

    public Node insertBefore (Node head, int key, int data)
    {
        Node mover = head;
        Node temp = new Node(data);

        while (mover != null) {
            if (mover.next.data == key) {
                temp.prev = mover;
                temp.next = mover.next;
                mover.next.prev = temp;
                mover.next = temp;
                break;
            }
            mover = mover.next;
        }
        return head;
    }
    
    public Node deleteBefore (Node head, int key)
    {
        Node mover = head;
        
        while (mover != null)
        {
            if (mover.next.next.data == key)
            {
                mover.next.next.prev = mover;
                mover.next = mover.next.next;
                break;
            }
            mover = mover.next; 
        }
        return head; 
    }
}

public class doubly_LL {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Sample s = new Sample();

        Node head = s.arrToDoublyLL(arr);
        System.out.print("Array to DLL: ");
        s.traversal(head);
        System.out.println();

        head = s.insertFirst(head, 1111);
        System.out.print("Insert at first: ");
        s.traversal(head);
        System.out.println();

        head = s.insertLast(head, 999);
        System.out.print("Insert at Last: ");
        s.traversal(head);
        System.out.println();

        head = s.deleteFirst(head);
        System.out.print("Delete at First: ");
        s.traversal(head);
        System.out.println();

        head = s.deleteLast(head);
        System.out.print("Delete at Last: ");
        s.traversal(head);
        System.out.println();

        head = s.insertAfter(head, 50, 666);
        System.out.print("Insert after 50: ");
        s.traversal(head);
        System.out.println();

        head = s.deleteAfter(head, 50);
        System.out.print("Delete after 50: ");
        s.traversal(head);
        System.out.println();

        head = s.insertBefore(head, 50, 444);
        System.out.print("Insert before 50: ");
        s.traversal(head);
        System.out.println();

        head = s.deleteBefore(head, 50);
        System.out.print("Delete before 50: ");
        s.traversal(head);
        System.out.println();
    }
}
