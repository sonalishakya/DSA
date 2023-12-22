package PrepDSA.LinkedLists;

/**
 * @author: sonali.shakya
 */
public class Main {
    public static void main(String[] args) {

//        circularLL();
//        doublyLL();
        customLL();
    }

    private static void circularLL() {
        CircularLL ll = new CircularLL();
        ll.insertLast(4);
        ll.insertLast(6);
        ll.insertLast(8);
        ll.insertLast(9);
        ll.insertLast(10);
        ll.display();
        ll.deleteCir(9);
        ll.display();
    }

    private static void doublyLL() {
        DoublyLL ll = new DoublyLL();
        ll.insertFirst(15);
        ll.insertFirst(9);
        ll.insertFirst(8);
        ll.insertFirst(5);
        ll.display();
        ll.displayRev();
        ll.insertLast(19);
        ll.display();
        ll.insert(9, 10);
        ll.display();
    }

    private static void customLL() {
        CustomLL linkedList = new CustomLL();
        linkedList.insertFirst(5);
        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertLast(8);
        linkedList.insertLast(9);
        linkedList.insertLast(10);
//        linkedList.display();
        linkedList.insert(6, 3);
        linkedList.display();
//        System.out.println(linkedList.deleteLast());
//        linkedList.display();
//        System.out.println(linkedList.deleteFirst());
//        linkedList.display();
//        System.out.println(linkedList.delete(3));
//        linkedList.display();
//        linkedList.access(7, 4);
//        linkedList.display();
        linkedList.accessV2(7, 4);
        linkedList.display();

    }
}
