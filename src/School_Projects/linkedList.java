package School_Projects;


public class linkedList {

    private Node head;
    private int size;

    public linkedList() {
        head = null;
        size = 0;
    }

    public void add(String s) {
        Node newNode = new Node(s);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public int size() {
        return sizeRecursive(head);
    }

    private int sizeRecursive(Node current) {
        if (current == null) {
            return 0;
        } else {
            return 1 + sizeRecursive(current.getNext());
        }
    }

    public boolean find(String x) {
        Node current = head;
        while (current != null) {
            if (current.getData().equals(x)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            next = null;
        }

        public String getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
