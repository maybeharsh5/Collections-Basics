package FunctionalProgramming.zero3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class FP03MethodReferences {

    private static void print(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Spring","Spring Boot","API"
                ,"Microservices","AWS","Azure","Docker","Kubernetes");

//        courses.stream().map(str->str.toUpperCase()).forEach(System.out::println);
        courses.stream()
                //.map(str->str.toUpperCase())
                .map(String::toUpperCase).forEach(FP03MethodReferences::print);

//        Supplier<String> supplier = () -> new String();

        Supplier<String> supplier = String::new;
        // use this to create a new object, when you do supplier.get() you will get a new object.
    }
}
