package PrepDSA.LinkedLists;

/**
 * @author: sonali.shakya
 */
public class RecursionLL {
    public static void main(String[] args) {
        CustomLL linkedList = new CustomLL();
        linkedList.insertFirst(5);
        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertLast(8);
        linkedList.insertLast(9);
        linkedList.insertLast(10);
        linkedList.display();
        linkedList.insert(6, 3);
        linkedList.display();
        System.out.println(linkedList.deleteLast());
        linkedList.display();
        System.out.println(linkedList.deleteFirst());
        linkedList.display();
        System.out.println(linkedList.delete(3));
        linkedList.display();
        linkedList.access(7, 4);
        linkedList.display();
        linkedList.accessV2(7, 4);
        linkedList.display();
    }
}
