package ExceptionHandling;

public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }

    public static void method1(){
        extracted();
        System.out.println("Method1 Ended");
    }
    private static void extracted() {
        try {
//            String str = null;
//            str.length();

//             once exception it thrown
//             if extracted dont know who to handle it
//             it would send it to method()1 and now methode1() don't know who to handle ti
//             it would send to main() and it also don't know who to handle it so it would through an exception.
//             it would go up
//             StackTrace

            int[] i = {1,2};
            int number = i[3];

            // accessing an elment which ain't not there yoo
            System.out.println("Method Extracted ended");
        }
        // that exception or superclass of that exception
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (NullPointerException ex){
            System.out.println("Hey NullPointerException yoo");
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
