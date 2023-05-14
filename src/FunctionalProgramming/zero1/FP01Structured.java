package FunctionalProgramming.zero1;

import java.util.Arrays;
import java.util.List;

public class FP01Structured{

    public static void main(String[] args) {

        Integer[] a = new Integer[]{12,9,13,4,6,2,4,12,15};
        List<Integer> list = Arrays.asList(a);
//      printAllNumbersInListStructured(Arrays.asList(a));


//      printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
//      printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        printEvenNumbersInListFunctional(list);
        System.out.println("---");
        printSquareOfEvenNumbersInListFunctional(list);


    }

//    private static void printAllNumbersInListStructured(List<Integer> integers) {
//        for(int number : integers){
//            System.out.println(number);
//        }
//    }

    private static void print(int integers){
        System.out.println(integers);
    }

    private static void printAllNumbersInListFunctional(List<Integer> integers) {
//        [12,9,13,4,6,2,4,12,15]
//        12
//        9
//        13
//        4
//         stream of elements . . . . . .

//        integers.stream().forEach(FP01Structured::print);
//        classname::method
//         METHOD REFRENCE

        integers.stream().forEach(System.out::println);

    }

//    private static boolean isEven(int numbers){
//        return numbers%2==0;
//    }

    // integers -> integers%2==0 Simplified representation of method.
    // 1 statement by default would return it back
    private static void printEvenNumbersInListFunctional(List<Integer> integers){
        integers.stream()
                //.filter(FP01Structured::isEven)
                .filter(integer -> integer%2==0) // Lambda Expression
                .forEach(System.out::println);
                // Filter - only allow Even numbers.
    }

    private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers){
        numbers.stream().filter(number -> number % 2 == 0)
                // mapping x -> x*x
                .map(number -> number*number).forEach(System.out::println);
    }
}
