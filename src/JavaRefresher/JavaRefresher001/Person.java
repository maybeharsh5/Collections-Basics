package JavaRefresher.JavaRefresher001;

import java.util.HashMap;
import java.util.Objects;

public class Person {

    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }


    public static void main(String[] args) {

        Person person1 = new Person(10,"Arnav");
        Person person2 = new Person(20,"Sharukh");
        Person person3 = new Person(10,"Arnav");

        System.out.println(person1.equals(person3));

        System.out.println(person1.hashCode() + " " + person3.hashCode());

        // public native hashCode();
        //Native functions are those functions which are not present as a part of java code --> making call to os and getting value from system libraries.
        // unique values based on parameters and those include your memory address also.
        // person1 memory allocation is different from person2 memory allocation.
        // hashCode will be same , if the memory would be same.


        HashMap<Person, Boolean> personMap = new HashMap<>();

        personMap.put(person1,true);
        personMap.put(person3,true);

        // it dosen't depend just on the key value but also on hashCode() value.

        System.out.println(personMap);


    }
}

