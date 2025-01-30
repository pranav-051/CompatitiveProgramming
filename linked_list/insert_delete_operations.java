/*
 * Notes: 
 * after applying loop to iterate every time to next node 
 * that time always use mover = mover.next; 
 * and in loop alway apply condition mover != null * 
 */

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}

class Operations {

    public void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public Node insertFirst(Node head, int data) {
        Node newHead = new Node(data);
        newHead.next = head;

        return newHead;
    }

    public Node insertLast(Node head, int data) {
        Node newNode = new Node(data);
        Node mover = head;

        while (mover.next != null) {
            mover = mover.next;
        }
        mover.next = newNode;

        return head;
    }

    public Node insertAfter(Node head, int insertValue, int afterNode) {
        boolean found = false;
        Node mover = head;
        Node temp = new Node(insertValue);

        while (mover != null) {
            if (mover.data == afterNode) {
                temp.next = mover.next;
                mover.next = temp;
                found = true;

            }
            mover = mover.next;
        }
        if (found == false) {
            System.out.println("Given node value node found!");
        }
        return head;
    }

    public Node insertBefore(Node head, int insertData, int nodeValue) {
        Node newNode = new Node(insertData);

        if (head == null) {
            return head;
        }

        if (head.data == nodeValue) {
            newNode.next = head; // Insert the new node before the current head
            return newNode; // New node becomes the new head
        }

        // Traverse the list to find the node with nodeValue
        Node mover = head;
        Node prev = null;

        while (mover != null) {
            if (mover.data == nodeValue) {
                // Insert the new node before the current node
                prev.next = newNode;
                newNode.next = mover;
                break;
            }
            prev = mover; // Update prev to current node
            mover = mover.next; // Move to the next node
        }

        return head;
    }

    public Node deleteFirst(Node head) {
        Node newHead = head.next;
        return newHead;
    }

    public Node deleteLast(Node head) {
        Node mover = head;

        while (mover.next.next != null) {
            mover = mover.next;
        }
        mover.next = null;
        //here we iterate upto second last item and when we find it we make null to its next item.
        return head;
    }

    public Node deleteAfter(Node head, int data) //delete after given data value
    {
        Node mover = head;
        while (mover != null) {
            if (mover.data == data) {
                mover.next = mover.next.next;
                break;
            }
            mover = mover.next;
        }

        return head;
    }

    public Node deleteBefore(Node head, int data) //delete before node of data 
    {
        Node mover = head;
        while (mover != null) {
            if (mover.next.next.data == data) {
                mover.next = mover.next.next;
                break;
            }
            mover = mover.next;
        }

        return head;
    }

    public Node deleteSpecific(Node head, int data) {
        Node mover = head;
        while (mover != null) {
            if (mover.next.data == data) {
                mover.next = mover.next.next;
                break;
            }
            mover = mover.next;
        }

        return head;
    }

}

public class insert_delete_operations {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        Operations o = new Operations();
        o.display(head);

        head = o.insertFirst(head, 0);
        System.out.print("After inserting at 1st postion: ");
        o.display(head);

        head = o.insertLast(head, 11);
        System.out.print("After inserting at last postion: ");
        o.display(head);

        head = o.insertAfter(head, 666, 5);
        System.out.print("Insertion after specific node: ");
        o.display(head);

        head = o.insertBefore(head, 444, 5);
        System.out.print("Insertion before specific node: ");
        o.display(head);

        System.out.println("_______________________________________________");

        System.out.print("Original Linked list before delete operations: ");
        o.display(head);

        System.out.print("After first delete: ");
        head = o.deleteFirst(head);
        o.display(head);

        System.out.print("After last delete: ");
        head = o.deleteLast(head);
        o.display(head);

        System.out.print("Delete After: ");
        head = o.deleteAfter(head, 5); //delete 666 which is after 5
        o.display(head);

        System.out.print("Delete before: ");
        head = o.deleteBefore(head, 5); //delete 444 which is before 5
        o.display(head);

        System.out.print("Delete Specific: ");
        head = o.deleteSpecific(head, 5);
        o.display(head);
    }
}
