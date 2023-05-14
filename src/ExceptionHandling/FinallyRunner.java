package ExceptionHandling;

import java.util.Scanner;

public class FinallyRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
//            Scanner sc = new Scanner(System.in);

            int[] numbers = {12, 3, 4, 5};

            int number = numbers[5];

            System.out.println("Before Sc Close");

            // resource leak -> some system or resource memory is wasted unecc.
        }
        catch(Exception e){
//            System.exit(1);
            e.printStackTrace();
        }

        // System.out.println in finally throws an exception
        // only in that case finally won't executed
        // or Jvm crash happens System.exit(1);
        finally{
            System.out.println("Before Scanner Close");
            if(sc!=null) {
                sc.close();
            }
        }

        System.out.println("just before closing out main");
    }
}
