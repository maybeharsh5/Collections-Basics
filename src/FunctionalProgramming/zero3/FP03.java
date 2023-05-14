package FunctionalProgramming.zero3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03  {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> integerPredicate = x -> x % 2 == 0;

        Predicate<Integer> integerPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x%2==0;
            }
        };


       Function<Integer, Integer> integerIntegerFunction = x -> x * x;

        Function<Integer,Integer>integerIntegerFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };

       Consumer<Integer> println = System.out::println;

        Consumer<Integer> println2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        numbers.stream()
                .filter(integerPredicate2)
                .map(integerIntegerFunction2)
                .forEach(println2);

         BinaryOperator<Integer> sum1 = Integer::sum;
//         BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x+y:

        BinaryOperator<Integer> sum11 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        // squares  max , min , triplets different operations --> binary operator

        int sum = numbers.stream().reduce(0, sum11);
        System.out.println(sum);

        //accept apply are function descrptor.

    }
}
