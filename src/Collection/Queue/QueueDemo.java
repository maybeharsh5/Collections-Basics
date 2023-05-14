package Collection.Queue;

import java.util.*;

public class QueueDemo {


    public static void main(String[] args) {

//        ArrayList al = new ArrayList();
////      ArrayList aList = new ArrayList(30);
////
////        // size would increase performace anad time
////
////        //  ArrayList aList1 = new Array(Collection c);
//////
//        al.add(19);
//        al.add("Spike");
//        al.add(20);
////
////        System.out.println(al);
////
////        al.remove(1);
////
////        System.out.println(al);
////
////        al.remove(new Integer(19));
////
////        System.out.println(al);
////
////        System.out.println(al.get(0));
//
//        // it makes type safe and solve problem of type casting <String>
//
//
//
//
//        List<Integer> alist = new LinkedList<>();
//        alist.add(1);
//        alist.add(2);
//        alist.add(3);
//        alist.add(1);
//        alist.add(2);
//        alist.set(1,7);

////        System.out.println(alist);
////
////        for(int x : alist){
////            System.out.println(x);
////        }
//
////        List<Integer> alst2 = new ArrayList<>(alist);
////        alst2.add(10);
////        System.out.println(alst2);
////
////        System.out.println(alst2.indexOf(2));
//
//        // compiler will automatically create wrapper class.
//
////        alist.lastIndexOf(2);
////        alist.subList(1,4);
//        // last parameter excluded
//
//
////        System.out.println(alist);
////        List<Integer> alst3 = alst2.subList(1,4);
////        alst3.set(0,100);
////        System.out.println(alst3);
////        System.out.println(alst2);
//
////         100 got changed in the sub and also in main list.
////         function don't creates copy it provides you with view but if you make change it would also change underlying arraylist.
////
////        Integer[] arr = alist.toArray(new Integer[0]);
////
////         array as parameter to this function
////         remaning part would be null if we pass size more than arraylist that is not a good practice.
//
///*
//not recommended to use for insertion and deletion , if we have to add at position 1,
//it will be added to the position one and rest of the elements would be shifted,
//to position right.
//                      V
//Linked list best choice for insertion and deletion.
//linked list only need to change the address pointer of the particular node.
//
//
//Linked list for retrieval operations where as arrays is best for it
//Ex - If we want an element in the linked list we need to traversal through
//every linked list which is quite a hectic task!!
//0
// */
//
//         returns null if there is no element but remove add would though exeption.
//         peek() pool() offer()
//         deque at both end.(linked list)
//         deque interface implements queue interface to allow double ended queues,
//         fifo or can be used as stack (deque)
//         offerFirst , offerLast , addFirst , addLast , push
//         pollFirst , pollLast , pop , removeFirst , removeLast
//         fifo (stacks) arraydeque is cheat code
//         normal queue - linked list


//        //FIFO Queue


//        Deque <Integer> dq = new ArrayDeque<>();
//        dq.offerFirst(1);
//        dq.offerFirst(2);
//        System.out.println(dq);
//         till now it will work as stack
//         01bfs


//        dq.offerLast(3);
//        dq.offerLast(4);
//        dq.pollFirst();
//        System.out.println(dq.peekFirst());


//         Priority Queue --> works on priority
//         the implementation is based on priority heap , a tree like structure that yuelds an element at the head of the queue according to the priority ordering, which is defined either by natural ordering of its element ot by a comparator
//         elements of a priority Queue are not sorted.

////        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());


//        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

//         now we don't even need MyCustomComparator
//
//
//         Instead of ordering this Integer class is following it will follow no MyCC ordering.
//         what ever ordering class is implementing is called natural ordering (comparable) & what ever ordering you are passing as a (comparator) is called total ordering
//         total odering has always more prec. than natural ordering.
//         It's called total ordering (passing comparator to pq)
//         iF(comparator passed) {
//         comparator compare() is called } else{
//         class implemets comparable }
//         if(class implemets comparable)
//        {
//            comparable compareTo is executed
//        } else {
//            classcCast EXC.
//        }
//
//        pq.offer(0);
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(3);
//        pq.offer(4);
//
//        int index = 0;
//
//        List<Integer> top2 = new ArrayList<>();
//        while(!pq.isEmpty()){
//            if(index ==2 )
//                break;
//            top2.add(pq.poll());
//            index++;
//        }
//
//        System.out.println(top2);
//        System.out.println(pq);
//
//        // get me top 3 students acc. tp their maths marks.
//
//        List<StudentMarks> smarks = new ArrayList<>();
//        smarks.add(new StudentMarks(70,80));
//        smarks.add(new StudentMarks(30,10));
//
//        smarks.add(new StudentMarks(100,38));
//        smarks.add(new StudentMarks(40,88));
//        smarks.add(new StudentMarks(97,19));
//
//        // PriorityQueue<StudentMarks> pq1 = new PriorityQueue<>(smarks);
//
//        PriorityQueue<StudentMarks> pq1 = new PriorityQueue<>((s1 , s2) -> s2.getMaths()-s1.getMaths());
//
//
//          PriorityQueue<StudentMarks> pq1 = new PriorityQueue<>((s1 , s2) -> {
//
//              System.out.println("Comparator's compareTo() metho is called");
//              return s2.getPhysics()-s1.getPhysics();
//
//          });
//
//        // passing will override the natural ordering which exists for this class.
//        // a comparator will always override the natural ordering.
//
//        for(StudentMarks sm : smarks){
//            pq1.offer(sm);
//        }
//
//
//        List<StudentMarks> top3 = new ArrayList<>();
//        int index1 = 0;
//
//        while(!pq1.isEmpty()){
//           if(index1 == 3 )
//               break;
//            top3.add(pq1.poll());
//            index1++;
//        }
//
//        // sort in a particular order.
//        System.out.println(top3);
//        for(StudentMarks s:top3){
//        System.out.println(s.getPhysics());
//        //System.out.println(s.getPhysics());
//        }
//    }
//
//        // Integer - itself implements comparable interface
//        // so priority queue was calling compareTo method of Integer class.
//        // Integer - mein jasa likha ha ascending order me but in order to get in descending order
//        // we need to change the compareTo function, but are we allowed to do that??
//        // ans - we aren't  & it is also not a good way.
//        // in that case Comparator comes into picture yoo!!
//
//        Set<Integer> set1 = new HashSet<>(alist);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//        set1.add(2);
////        System.out.println(set1);
////        set1.remove(2);
//
////        set.clear();
//
//        Set<Integer> set2 = new HashSet<>(alist);
//
//        System.out.print(set1);
//        System.out.println(set2);
//
//        set1.retainAll(set2);
//
//        System.out.print(set1);
//        System.out.println(set2);
//        // parameter one would be unchanged.
//        // intersection of two set is going on
//        // 2nd set would be call but on which this method was called only interesction would be there that is the reason that set would change.
//
//        set1.addAll(set2);
//        System.out.println(set1);
//        // it will perform union.
//
//
//        set1.removeAll(set2);
//        //intersection would be reomved from calling one.
//        System.out.print(set1);
//        System.out.println(set2);
//
//        // hash set insertion and deletion takes constant time.
//
//        // it won't follow any order
//        // you can't sort here in HashSet
//
//        Set<StudentMarks> set3 = new LinkedHashSet<>(smarks);
//        for(StudentMarks s : set3){
//            System.out.println(s.getPhysics()+" "+s.getMaths());
//        }

//        System.out.println(set3.contains(new StudentMarks(70,80)));


        // but it is there sheeshh!!

        // to generate hash!!


//
//        for(int x : set3) {
//            System.out.print(x+ ",");
//        }

//
//      only use HashSet rarely use LinkedHashSet
        // sorted set = set would be sorted
        // first() last()
        // NavigableSet Interface
        // pollFirst() ceiling() higher() pollLast() floor() lower()

        // HashMap is not threadsafe & permits only one null key
        // HashTable - thread safe!!


    }
 }
//     conclusion comparator WINS!!
//    always pass comparator like this.
