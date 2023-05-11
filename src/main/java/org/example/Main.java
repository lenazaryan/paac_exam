package org.example;

import java.util.*;

import static org.example.Person.createPerson;

public class Main {
    public static void main(String[] args) {

        //11.
        List<Person> personList = createPerson(99);
        personList.forEach(System.out::println);
        System.out.println();
        printPersonOlderAge60(personList);
        removePersonWithEvenID(personList);
        System.out.println(personList);

        //12.
        List<Map<String, Object>> userList = new LinkedList<>() {{
            add(createUserBody("Lena", "test@gmail.com", 29));
            add(createUserBody("Mery", "test@gmail.com", 29));
            add(createUserBody("Shushan", "test@gmail.com", 17));
        }};
        System.out.println(userList);
        removeUserUnderAge18(userList);

        System.out.println(userList);
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
            if (!(p.getId() % 2 == 0)) {
                list.remove(p);
            }
        }
        return list;
    }

    public static Map<String, Object> createUserBody(String fullName, String email, Integer age) {
        return new HashMap<>() {{
            put("Full Name: ", fullName);
            put("Email: ", email);
            put("Age: ", age);
        }};
    }

    public static void removeUserUnderAge18(List<Map<String, Object>> userList) {
        for (Map<String, Object> user : userList) {
            if((int)user.get("Age: ") < 18){
                userList.remove(user);
            }
        }
    }

}