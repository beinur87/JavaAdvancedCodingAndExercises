package ro.sda.advanced._5_linkedlist;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // key - value collection for name - age of a person
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("Catalin", 25);
        myMap.put("Mihai", 40);
        myMap.put("Andrei", 70);
        myMap.put("Leonardo", 60);


        System.out.println("Mihai age: " +  myMap.get("Mihai"));
        System.out.println("Andrei age: " +  myMap.get("Andrei"));

        System.out.println("----------------------");

        Map<String, Person> personMap = new HashMap<>();

        personMap.put("Catalin", new Person("Catalin", "Manaila", 25));
        personMap.put("Mihai", new Person("Mihai", "Popescu", 40));
        personMap.put("Ronaldo", new Person("Crstiano", "Ronaldo", 38));
//        personMap.put("Catalin", new Person("a", "a", -1));

        System.out.println(personMap.get("Catalin"));

    }
}

class Person{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}