package PrepDSA.LinkedLists;

/**
 * @author: sonali.shakya
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        CustomLL ll = new CustomLL();
        ll.insertLast(1);
        ll.insertLast(1);
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(2);
        ll.insertLast(2);
        ll.display();
        ll.removeDuplicate();
        ll.display();
    }
}
