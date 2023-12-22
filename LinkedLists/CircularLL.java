package PrepDSA.LinkedLists;

/**
 * @author: sonali.shakya
 */
public class CircularLL implements LL {

    private Node head;
    private Node tail;
    private int size = 0;

    @Override
    public void insertFirst(int value) {

    }

    @Override
    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    @Override
    public void insert(int value, int index) {

    }

    @Override
    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + " --> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("END");
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int deleteFirst() {
        return 0;
    }

    @Override
    public int deleteLast() {
        return 0;
    }

    @Override
    public int delete(int index) {
        return 0;
    }

    public void deleteCir(int value) {
        Node node = head;
        if (node == null)
            return;

        if (node.value == value) {
            head = node.next;
            tail.next = node;
            return;
        }

        while (node.next.value != value) {
            node = node.next;
        }
        node.next = node.next.next;



    }

    private class Node {
        private Node next;
        private int value;

        public Node(){
            this.next = null;
        }

        public Node(Node next) {
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }




}
