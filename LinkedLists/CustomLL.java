package PrepDSA.LinkedLists;

/**
 * @author: sonali.shakya
 */
public class CustomLL implements LL {

    private Node head;
    private Node tail;
    private int size;

    public CustomLL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null)
            tail = head;
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        for (int i = 0 ; i < index-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        return val;
    }

    public int deleteLast() {
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        secondLast.next = null;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 0 ; i < index-1; i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        return val;
    }

    public void access(int value, int index){
        insertRec(value, index, head);
    }

    public void insertRec(int value, int index, Node currentNode) {
        if (index == 1) {
            Node node = new Node(value);
            node.next = currentNode.next;
            currentNode.next = node;
            return;
        }

        if (currentNode.next != null)
            insertRec(value, index-1, currentNode.next);
        else
        {
            Node node = new Node(value);
            currentNode.next = node;
            node.next = null;
        }
    }
    public void accessV2(int value, int index){
        head = insertRecV2(value, index, head);
    }

    private Node insertRecV2(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRecV2(value, index-1, node.next);
        return node;
    }

    public void removeDuplicate(){
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
            } else
                node = node.next;
            System.out.print(node.value + " --> ");
        }
    }
}

