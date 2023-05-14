package Collection.CursorsImportant;


import java.util.ArrayList;
import java.util.Iterator;

// an indicator to show the current position for respective object of element.
// enumeration.
// iterator.
// ListIterator.
// Spliterator.

// iterator object using an iterator method of collection interface.
// this iterator method will create equilent iterator object for the given arraylist object.
public class CursorsImp {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();


        data.add(10);
        data.add(20);
        data.add(30);

        Iterator  itr = data.iterator();

        while(itr.hasNext()){

            Integer i = (Integer) itr.next();

            if(i%3 == 0){
                System.out.println(i);
            } else {
                itr.remove();
            }
        }

        System.out.println(data);

    }
}
