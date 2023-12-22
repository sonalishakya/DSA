package PrepDSA.LinkedLists;

/**
 * @author: sonali.shakya
 */
public class DoublyLL implements LL {

    private Node head;
    private Node tail;
    private int size;

    DoublyLL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

    }

    @Override
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null)
            head.prev = node;
        head = node;
        size++;
    }

    @Override
    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            node.next = null;
            node.prev = null;
            head = node;
            size++;
            return;
        }
        Node temp = head;
        Node last = null;

        while (temp != null) {
            last = temp;
            temp = temp.next;
        }
        node.next = null;
        node.prev = last;
        last.next = node;
        tail = node;
        size++;
    }

    @Override
    public void insert(int after, int value) {
        Node p = find(after);
        if (p == null) {
            System.out.println("No value such as " + after + " found!");
            return;
        }
        Node node = new Node(value);
        node.prev = p;
        node.next = p.next;
        p.next = node;
        if (node.next != null)
            node.next.prev = node;


    }

    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    @Override
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <--> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayRev(){
        Node temp = head;
        Node last = null;
        while (temp != null) {
            last = temp;
            temp = temp.next;
        }
        while (last != null) {
            System.out.print(last.value + " <--> ");
            last = last.prev;
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


}
