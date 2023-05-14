package ExceptionHandling;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }

    public static void method1(){
        extracted();
        System.out.println("Method1 Ended");
    }
    private static void extracted() {
        String str = null;
        str.length();
        // once exception it thrown
        // if extracted dont know who to handle it
        // it would send it to method()1 and now methode1() don't know who to handle ti
        // it would send to main() and it also don't know who to handle it so it would through an exception.
        // it would go up
        // StackTrace

        System.out.println("Method Extracted ended");
    }
}
