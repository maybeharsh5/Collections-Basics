package Collection.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        ArrayList aList = new ArrayList(30);

        // size would increase performace anad time

       //  ArrayList aList1 = new Array(Collection c);

        al.add(19);
        al.add("Spike");
        al.add(20);

        System.out.println(al);

        al.remove(1);

        System.out.println(al);

        al.remove(new Integer(19));

        System.out.println(al);

        System.out.println(al.get(0));

        // it makes type safe and solve problem of type casting <String>




        List<Integer> alist = new LinkedList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(1);
        alist.add(2);
        alist.set(1,7);

        System.out.println(alist);
//
//        for(int x : alist){
//            System.out.println(x);
//        }

        List<Integer> alst2 = new ArrayList<>(alist);
        alst2.add(10);
        System.out.println(alst2);

        System.out.println(alst2.indexOf(2));

        // compiler will automatically create wrapper class.

        alist.lastIndexOf(2);
        alist.subList(1,4);
        // last parameter excluded


        System.out.println(alist);
        List<Integer> alst3 = alst2.subList(1,4);
        alst3.set(0,100);
        System.out.println(alst3);
        System.out.println(alst2);

        // 100 got changed in the sub and also in main list.
        // function don't creates copy it provides you with view but if you make change it would also change underlying arraylist.

        Integer[] arr = alist.toArray(new Integer[0]);
        // array as parameter to this function
        // remaning part would be null if we pass size more than arraylist that is not a good practice.

    }
}
/*
not recommended to use for insertion and deletion , if we have to add at position 1,
it will be added to the position one and rest of the elements would be shifted,
to position right.
                      V
Linked list best choice for insertion and deletion.
linked list only need to change the address pointer of the particular node.


Linked list for retrieval operations where as arrays is best for it
Ex - If we want an element in the linked list we need to traversal through
every linked list which is quite a hectic task!!
0
 */
