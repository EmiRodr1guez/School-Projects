package School_Projects;

class MyNode {
    int data;
    MyNode next;

    public MyNode() {
        data = 0;
        next = null;
    }

    public MyNode(int data) {
        this.data = data;
        next = null;
    }
}

public class MyQueue {
    MyNode front;
    MyNode back;

    public MyQueue() { // gen queue
        front = back = null;
    }

    public void enqueue(int x) { //Enqueues
        MyNode newNode = new MyNode(x);
        if (back == null) {
            front = back = newNode;
        } else {
            back.next = newNode;
            back = back.next;
        }
    }

    public int dequeue() throws Exception { //Dequeue
        if (front == null) {
            throw new Exception("The queue is empty");
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            back = null;
        }
        return value;
    }

    public int peek() throws Exception { //peek
        if (front == null) {
            throw new Exception("The queue is empty");
        }
        return front.data;
    }
}
