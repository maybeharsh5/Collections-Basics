package FunctionalProgramming.zero3;

import jdk.jshell.ImportSnippet;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class FP03BehaviorParameterization {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

//        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
//        Predicate<Integer> integerPredicate1 = x -> x % 2 != 0;
//        Function<Integer,String> fun = x-> x + " ";


//        filterAndPrint(numbers, x->x%2==0);

//        filterAndPrint(numbers, x->x%2!=0);

        filterAndPrint(numbers,x->x%3==0);

        // behaviour of method as argument [CODE OF METHOD AS PARAMETER]

        List<Integer> squaredNumbers = mapAndPrint(numbers,x->x*x);
         System.out.println(squaredNumbers);

         // No input > Return Something

        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };

        System.out.println(randomIntegerSupplier.get());

        // Urinary Operator
        // one parametere as input & it returns the result of same type as output.

        UnaryOperator<Integer> unaryOperator = x -> 3*x;
        System.out.println(unaryOperator.apply(10));


        //2 inputs and output would be boolean - bipredicate
        BiPredicate<Integer,String> biPredicate = (number,str)-> true;
        System.out.println(biPredicate.test(5,"Yoyoyo"));

        // output can be anything not necessary as boolean

        BiFunction<Integer,String,String> biFunction = (number,str)->{
            return number+" "+str;
        };
        System.out.println(biFunction.apply(20,"sharma"));


        // Bi consumer takes two input and it consumes and it , don't return anythingback

        BiConsumer<Integer,String > biConsumer = (s1,s2)->{
            System.out.println(s1);
            System.out.println(s2);
        };

        biConsumer.accept(22,"harsh");
        // we can ignore 2nd parameter here , like input to do hone hi chaheaa.

        IntBinaryOperator intBinaryOperator = (x,y) -> x+y;
        // Primitive operations

//        Imp
//        Predicate<Integer> isEvenPredicate = (Integer x) -> x%2 == 0;
//        BinaryOperator<Integer> sumBinaryOperator = (Integer x,Integer y) -> x+y;
//          Type Inference

    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream().filter(predicate)
                .forEach(System.out::println);
    }

    private static List<Integer> mapAndPrint(List<Integer> numbers , Function<Integer,Integer> mappingFunction){
        return numbers.stream().map(mappingFunction).collect(Collectors.toList());
    }
}
