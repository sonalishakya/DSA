package PrepDSA.LinkedLists;

/**
 * @author: sonali.shakya
 */
public class Questions {

    private Node head;
    private Node tail;
    private int size;

    public Questions() {
        this.size = 0;
    }

    public static void main(String[] args) {
//        removingDuplicates();
//        recursiveInsertion();
//        mergingLists();
//        happyNumber(19);
//        mainForReverse();
//        mainInPlaceRev();
//        mainRangeRev();
//        kRev(list, 3);
        Questions list = new Questions();
//        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
//        list.insertLast(4);
//        list.insertLast(5);
//        list.insertLast(6);
//        list.insertLast(7);
//        list.insertLast(8);
//        list.insertLast(9);
//        list.insertLast(10);
        rotate(list, 10);
        list.display();
    }

    public static void rotate(Questions list, int k) {
        if (list.head != null && list.head.next != null && k > 0) {
            Node node = list.head;
            int count = 1;
            while (node.next != null) {
                node = node.next;
                count++;
            }
            System.out.println( "Lenghth : " + count);
            node.next = list.head;
            count -= k%count - 1;
            Node newLast = list.head;
            System.out.println( "Skip : " + count);
            while(count != 0) {
                newLast = newLast.next;
                count--;
            }
            list.head = newLast.next;
            newLast.next = null;
        }
    }



    // 1 -> 2 -> 3 -> 3 -> 2 -> 1
    public static void palindrome() {
        // traverse midway
        // reverse the rest of the array
        // compare

    }


    public static void mainRangeRev() {
        Questions list = new Questions();
        list.insertLast(10);
        list.insertLast(9);
        list.insertLast(8);
        list.insertLast(7);
        list.insertLast(6);
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        rangeRev(list, 2, 7);

    }

    public static void kRev(Questions list, int k) {
        int left, right, n, i = 0;
        Node node = list.head;
        while (node != null) {
             n = k;
             left = i * k+1;
             right = left + k - 1;
//            System.out.println("left " + left + " right " + right);
            if (i%2 == 0)
                rangeRev(list, left, right);
            i++;
             while (n != 0 && node != null) {
                 node = node.next;
                 n--;
             }
//             System.out.print(i + " : ");
        }
        list.display();
    }

    public static void rangeRev(Questions list, int left, int right) {
       Node curr = list.head;
       Node prev = null;
       if (left == right || left > right)
           return;

       for (int i = 0; curr != null && i < left - 1; i++) {
           prev = curr;
           curr = curr.next;
       }
       Node newStart = prev;
       Node newEnd = curr;

       Node next = curr.next;
       for (int i = 0; curr != null && i < right-left + 1; i++) {
           curr.next = prev;
           prev = curr;
           curr = next;
           if (next != null)
               next = next.next;
       }
       if (newStart != null)
           newStart.next = prev;
       else
           list.head = prev;

       newEnd.next = curr;
    }

    public static void mainInPlaceRev() {
        Questions list = new Questions();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        inPlaceRev(list);

    }

    public static void inPlaceRev(Questions list) {
        Node prev = null;
        Node curr = list.head;
        Node next = list.head.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null)
                next = next.next;
        }
        list.head = prev;
        list.display();
    }
    private static void mainForReverse() {
        Questions list = new Questions();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        Questions rev = new Questions();
        list.display();
        reverse(list.head, rev);
        rev.display();
    }
    // 5 -> 4 -> 3 -> 2 -> 1
    public static void reverse(Node node, Questions rev) {
        int temp = node.value;
        if (node == null) {
            return;
        }
        if (node.next != null)
            reverse(node.next, rev);
        rev.insertLast(temp);
    }

    public static void happyNumber(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);
        if (slow == 1) {
            System.out.println(n + " is a happy number");
            return;
        }
        System.out.println(n + " is not a happy number");
    }

    public static int square(int temp) {
        int tempSum = 0;
        while(temp > 0) {
            int rem = temp%10;
            tempSum = tempSum + (rem*rem);
            temp = temp/10;
        }
        return tempSum;
    }



    public boolean existsCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    public int cycleLength(Node head) {
        Node fast = head;
        Node slow = head;
        int count = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                count = 1;
                while (slow.next != fast) {
                    count++;
                    slow = slow.next;
                }
            }
        }
        return count;
    }

    public Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        int count = 0;

        //checking if cycle exists
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = head;
                while(fast != slow) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void mergingLists() {
        Questions list1 = new Questions();
        Questions list2 = new Questions();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);
        list1.display();
        list2.display();
        Questions list = new Questions();
        list = list.merge(list1, list2);

        list.display();

    }

    public Questions merge(Questions q1, Questions q2) {
        Node list1 = q1.head;
        Node list2 = q2.head;
        Questions list = new Questions();
        Node node = list.head;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                list.insertLast(list1.value);
                list1 = list1.next;
            } else {
                list.insertLast(list2.value);
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            list.insertLast(list1.value);
            list1 = list1.next;
        }

        while (list2 != null) {
            list.insertLast(list2.value);
            list2 = list2.next;
        }

        return list;
    }

    private static void recursiveInsertion() {
        Questions linkedList = new Questions();
        linkedList.insertFirst(5);
        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertLast(8);
        linkedList.insertLast(9);
        linkedList.insertLast(10);
        linkedList.display();
        linkedList.insertRecV2(7, 4, linkedList.head);
        linkedList.display();
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

    private static void removingDuplicates() {
        Questions q = new Questions();
        q.insertLast(1);
        q.insertLast(1);
        q.insertLast(2);
        q.insertLast(2);
        q.insertLast(2);
        q.insertLast(3);
        q.insertLast(3);
        q.display();
        q.removeDuplicate();
        q.display();
    }

    public void removeDuplicate(){
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
            } else
                node = node.next;
        }
    }


    // Utils
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null)
            tail = head;
        size++;
    }

    public void insertLast(int value) {
//        if (head == null) {
//            insertFirst(value);
//            return;
//        }
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
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
}
