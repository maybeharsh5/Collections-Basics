package FunctionalProgramming.zero2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Structured {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<Integer> doublesNumbers = doubleList(numbers);
        List<Integer> evenNumbers = numbers.stream().filter(x ->x %2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println("---");
        System.out.println(doublesNumbers);
        System.out.println("---");
        List<String> courses = List.of("Java","SD","DSA","Algo","compitative coding");
//       List<String > answer = courses.stream().map(x->x.length()).collect(Collectors.toList());
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("---");
        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
        // use length of string as comparisation.
        System.out.println("---");
        int sum = addListFunctional(numbers);
        System.out.println(sum);
        System.out.println("---");
        int max = maximumofall(numbers);
        System.out.println(max);
        System.out.println("---");
        int min = minimumofAll(numbers);
        System.out.println(min);
        System.out.println("---");
        int add = squareAndAdd(numbers);
        System.out.println(add);
        System.out.println("---");
        int oddsum = sumOfOdd(numbers);
        System.out.println(oddsum);
        System.out.println("---");
        distinctAndSorted(numbers);

    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        //1 , 5 , 6
        //1 -> 1
        //5 -> 5
        //6 -> 36
        return numbers.stream().map(x->x*x).collect(Collectors.toList());
    }

    private static void distinctAndSorted(List<Integer> numbers) {
        numbers.stream().distinct().forEach(System.out::println);
        // removes duplicate, only distinct values are printed
        System.out.println("---");
         numbers.stream().sorted().forEach(System.out::println);
    }

    private static int sumOfOdd(List<Integer> numbers) {
//        return numbers.stream().filter(x->x%2==1).reduce(0,Integer::sum);
          return numbers.stream().filter(x->x%2!=0).reduce(0,(x,y)->x+y);

    }

    private static int squareAndAdd(List<Integer> numbers) {
        //return numbers.stream().reduce(0,(x,y)->x+(y*y));
          return numbers.stream().map(x->x*x).reduce(0,Integer::sum);
    }




    private static int minimumofAll(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MAX_VALUE,(x,y) -> y<x?y:x);
    }

    private static int maximumofall(List<Integer> numbers) {
       return numbers.stream().reduce(Integer.MIN_VALUE,(x,y) -> x>y?x:y);
    }



    private static int addListFunctional(List<Integer> numbers) {
//       return numbers.stream().reduce(0,FP02Structured::sum);
//        Stream of number -> one result value
//        combine them into one result => One Value
//        0 and (a,b) -> a,b
//        0 12
//        12 9
//        21 13
        return numbers.stream()
                //.reduce(0, (x,y) -> x+y);
                .reduce(0,Integer::sum);
    }

//    private static int sum(int aggreator , int nextNumber){
//        return aggregator+nextNumber;
//    }

//    private static int addListStructured(List<Integer> numbers) {
//        int sum = 0;
//        for(int number : numbers){
//            sum = sum+number;
//        }
//        return sum;
//    }
}
