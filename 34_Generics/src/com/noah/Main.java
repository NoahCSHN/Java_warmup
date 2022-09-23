package com.noah;

import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Person[] person = new Person[]{
            new Person("ida", 28, "Teacher"),
            new Person("noah", 28, "Engineer"),
            new Person("LaoWu", 4, "Dog")
        };

        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
    }
}

class Person implements Comparable<Person> {
    public String name;
    public int age;
    public String post;

    public Person(){

    }

    public Person(String name, int age, String post){
        this.name = name;
        this.age = age;
        this.post = post;
    }

    public int compareTo(Person other){
        int age = this.age - other.age;
        if (age == 0){
            return this.name.compareTo(other.name);
        }else{
            return age;
        }
    }
    public String toString(){
        return this.name+','+this.age+':'+this.post;
    }
}