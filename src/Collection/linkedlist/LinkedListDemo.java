package Collection.linkedlist;
import java.util.LinkedList;
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        //LinkedList ll = new LinkedList(Collection c);
        // equilaent linkelist to that set or arraylist.
        // implement doubly linked list.

        l.add(10);
        l.add(20);
        l.add("Sharma");

        System.out.println(l);

        l.set(1,13);

        System.out.println(l);

        l.add(2,true);

        System.out.println(l);

        l.removeLast();

        l.addFirst(1);

        System.out.println(l);


    }
}
