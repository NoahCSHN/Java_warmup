package com.noah.equals;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Person> list = List.of(
            new Person("Xiao", "Ming", 18),
            new Person("Xiao", "Hong", 25),
            new Person("Bob", "Smith", 20)
        );
        boolean exist = list.contains(new Person("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }
}

class Person {
    String firstName;
    String lastName;
    int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o){
        boolean IsEqual = true;
        if(o instanceof Person) {
            Person other = (Person) o;
            if(Objects.equals(this.firstName, other.firstName) == false) IsEqual = false;
            if(Objects.equals(this.lastName, other.lastName) == false) IsEqual = false;
            if(this.age != other.age) IsEqual = false;
        }else{
            IsEqual = false;
        }    
        return IsEqual;
    }
}