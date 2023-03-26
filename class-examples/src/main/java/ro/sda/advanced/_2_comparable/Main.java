package ro.sda.advanced._2_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(9);
        array.add(6);
        array.add(4);
        array.add(7);

        for(int i = 0; i<array.size();i++){
            System.out.println(array.get(i));
        }

        System.out.println("---------------------------------------");
        Collections.sort(array);

        for(int i = 0; i<array.size();i++){
            System.out.println(array.get(i));
        }

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Catalin", 25));
        personList.add(new Person("Mihai", 5));
        personList.add(new Person("Lucian", 17));
        personList.add(new Person("Andrei", 70));

        for(int i = 0; i< personList.size();i++){
            System.out.println(personList.get(i));
        }
        System.out.println("---------------------------------------");
        Collections.sort(personList);
        for(int i = 0; i< personList.size();i++){
            System.out.println(personList.get(i));
        }

    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.age>o.getAge()){
            return 1;
        }else if (this.age<o.getAge()){
            return -1;
        }
        return 0;
    }
}
