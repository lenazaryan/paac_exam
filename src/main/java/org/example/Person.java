package org.example;

import org.apache.commons.lang3.RandomStringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class Person implements Comparable {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        id = (int) (Math.random() * 100);
        firstName = RandomStringUtils.randomAlphabetic(10);
        lastName = RandomStringUtils.randomAlphabetic(10);
        age = (int) (Math.random() * 100);
    }

    public static List<Person> createPerson(int numOfPerson){
        List<Person> people = new LinkedList<>();
        for (int i = 0; i <= numOfPerson; i ++){
            people.add(new Person());
        }
        return people;
    }

    public int getId() {
        return id;
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
                "id='" + id + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getId() == person.getId() && getAge() == person.getAge() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public int compareTo(@NotNull Object other) {
        String selfString = toString();
        String otherString = other.toString();
        return selfString.compareTo(otherString);
    }

}
