
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {

    Node front = null;
    Node last = null;
    int size = 0;

    public void push(int data) {
        Node newNode = new Node(data);
        if (front == null && last == null) {
            front = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void pop() {
        if (front == null) {
            System.out.println("Already empty");
        }
        front = front.next;
    }

    public void front() {
        System.out.println("Front Item: " + front.data);
    }

    public void size() {
        System.out.println("Total size: " + size);
    }

    public void display() {
        Node mover = front;
        while (mover != null) {
            System.out.print(mover.data + "\t");
            mover = mover.next;
        }
    }
}

class queueLL {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(10);
        q.push(3);
        q.push(22);

        q.pop();
        q.pop();

        q.front();
        q.size();
        q.display();
    }
}
