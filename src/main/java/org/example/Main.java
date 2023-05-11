package org.example;

import java.util.List;

import static org.example.Person.createPerson;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = createPerson(99);
        personList.forEach(System.out::println);
        System.out.println();
        printPersonOlderAge60(personList);
        removePersonWithEvenID(personList);
        System.out.println(personList);

//        Map<>

    }

    public static void printPersonOlderAge60(List<Person> list) {
        for (Person p : list) {
            if (p.getAge() > 60) {
                System.out.println(p);
            }
        }
    }

    public static List<Person> removePersonWithEvenID(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            if(!(p.getId()%2==0)){
                list.remove(p);
            }
        }
        return list;
    }

}