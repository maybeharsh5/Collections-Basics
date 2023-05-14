package Collection.list;
import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {

        LinkedList<Integer> lk = new LinkedList<>();
        lk.add(1);
        lk.add(2);
        lk.add(3);

//        Iterator<Integer> it = lk.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        ListIterator<Integer> iterator = lk.listIterator();



        // returning the current element and the moving to next.
        System.out.println(iterator.next());
        // it return me the one and index got to other;
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasPrevious());
        // in prev it will first move to previous and then return the value.


    }
}
