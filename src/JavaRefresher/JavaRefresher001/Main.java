package JavaRefresher.JavaRefresher001;

public class Main {
    public static void main(String[] args) {
//
//        Main.InnerClass innerClass = new Main.InnerClass();
//        innerClass.func(10);

        /* 2

        Map<Integer,Integer> frequencyMap = new HashMap<>();
        frequencyMap.put(2,4);
        frequencyMap.put(1,45);
        frequencyMap.put(3,50);
        frequencyMap.put(2,5);
        // this entry would be overriden

        int sum=0;

        Set<Map.Entry<Integer,Integer>> entrySet = frequencyMap.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            sum = sum+(entry.getKey() *entry.getKey());
        }
    }
         */

        /*
    MyHashMap myHashMap = new MyHashMap();
    myHashMap.multiply(12,22);
    // use all functions there in MyHashMap;
     MyMap myhashmap = new MyHashMap();
        //invoke functions that are declared in interface or there in interface.
        // to restrict functionality of interface.
      */


    /*
    private static class InnerClass{
        private int a;
        public void func(int a){
            this.a=a;
            System.out.println("a= "+a);
        }
    }

     */
        MyMap myMap = new MyMap() {
            @Override
            public int add(int a, int b) {
                System.out.println("in block a");
                return a+b;
            }
        };

        MyMap myMap1 = (a,b) ->{
            System.out.println("in block b");
            return a+b;
        };
        // multiline lamda = return
        System.out.println(myMap.add(1,2));
        System.out.println(myMap1.add(1,2));

    }
}

// byte code main ka hi banega and inner class ka nahi hoga so uska nahi banega cuzz main class hi call kardegi usko!!
// JDK - compiles your code .java -> .class
// JRE - contains JVM where .class file runs
// javac Main.java
// java Main.java
// byte code is binary
// we can see in intellij because, it is functionality of jdk (decompile.class file) arraylist --> arraylist is coming from rt.jar!!
// external files - jar files which comprise of your java jdk.
// .iml files are --> helper file for intellij so you can say as util file for intellij.
// these .iml are not even deployed at deployment server.
// only exceptions -> comparator