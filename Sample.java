class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }

    Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class convert 
{
    public void arrToLL (String arr[])
    {
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

class Sample 
{
    public static void main(String[] args) {
        convert c = new convert();
        String arr[] = { "1", "2", "3", "4" , null};
        
        c.arrToLL(arr);
    }
}