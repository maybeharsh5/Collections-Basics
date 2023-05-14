package JavaRefresher.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // take some value and convert in to list.
        // 2 4 6 8 10
        // 4 16 36 64 100
        // 228
        // 11, 22, 33, 44, 55, 66, 77, 88, 99, 1010

        int sum = 0;
        for(Integer number : numbers){
            if(number%2==0){
                sum = sum + (number*number);
            }
        }

        System.out.println(sum);

//         <? super T is T only, ? extends R means something which is child of R & something which is parent of t)
//         it won't change data structure
//         code become more readable
//         transformations of your element
//         stream is also an interface

       int result = numbers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
//                String result = " " + integer + integer;
                return integer*integer;
            }
        }).reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                System.out.println("In reduce:" + integer+ " " + integer2);
                return integer + integer2;
            }
        });



        System.out.println(result);
    }
}
