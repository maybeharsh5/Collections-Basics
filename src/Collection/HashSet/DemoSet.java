package Collection.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

// duplicates not allowed
// we can add null value
// implements serializable and cloneable interface
// insertion orders not preserved
// use all methods present in collection interface
// Underlying ds hashset
// generates hashcode for the past object --> will perform mod operation of generated hashCode with has table size.


public class DemoSet {

    public static void main(String[] args) {
//        HashSet hs = new HashSet();
        // it has size 16 (initial capacity);
//
//        HashSet hs1 = new HashSet(100);

        // load factor represents at what level HashMap capacity should change
        // By default load factor is 7.5
        // so if set is filled with 75% os space it doubles the size.
        // current size  * 2 ; == 200

//        HashSet hs3 = new HashSet(100 , .80f);

//        LinkedHashSet<Integer> lhs = new LinkedHashSet();
//        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>(30);
//        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>(20,1.00f);
        // 100% space would be filled twice would be generated i.e. is 40
        // underlying ds = combination of linked list and hash table.


//        IMP


    }

}
