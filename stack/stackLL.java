
class Node {

    int data; // data
    Node next; // next node

    Node() {
    }

    ;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {

    int size = 0;
    Node top = null;

    public void push(int data) {
        Node temp = new Node(data);
        if (top == null) {
            top = temp;
            size++;
        } else {
            temp.next = top;
            top = temp;
            size++;
        }

    }

    public void pop() {
            top = top.next;
            size--;

    }

    public void size() {
        System.out.println("Total size: " + size);
    }

    public void top() {
        System.out.println("Top: " + top.data);
    }

    public void display() {
        Node mover = top;
        if (mover == null) System.out.println("Already empty can display");
        while (mover != null) {
            System.out.print(mover.data + "\t");
            mover = mover.next;
        }
    }
}

class stackLL {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.push(140);
        stack.push(1500);
        stack.push(1460);
        stack.push(1260);
        stack.push(160);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.top();
        stack.size();
        stack.display();
    }
}
