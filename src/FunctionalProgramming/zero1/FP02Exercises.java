package FunctionalProgramming.zero1;

import java.util.Arrays;
import java.util.List;

public class FP02Exercises {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        printCubesOfoddnumbers(al);
        System.out.println("---");
        List<String> courses = List.of("Java","Python","Microservices");
        courses.stream().forEach(System.out::println);
        System.out.println("---");
        courses.stream().filter(course->course.contains("Java")).forEach(System.out::println);
        System.out.println("---");
        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
        System.out.println("---");
        courses.stream().map(course -> course + " " +course.length()).forEach(System.out::println);

    }

    private static void printCubesOfoddnumbers(List<Integer> numbers){
        numbers.stream().filter(number->number %2 != 0).map(number->number*number*number)
        .forEach(System.out::println);
    }
}

