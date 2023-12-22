package PrepDSA.LinkedLists;

/**
 * @author: sonali.shakya
 */
public interface LL<T> {
    void insertFirst(int value);
    void insertLast(int value);
    void insert(int value, int index);
    void display();
    T get(int index);
    int deleteFirst();
    int deleteLast();
    int delete(int index);
}
