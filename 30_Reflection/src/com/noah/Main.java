package com.noah;

import java.lang.reflect.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Main.class);
        Student gyy = new Student("gyy", 8);
        Class cls = Student.class;

        // logger.info(name.get(gyy));
        // logger.info(age .get(gyy));
        // logger.info(title.get(gyy));
        // logger.info(grade.get(gyy));
        // logger.info(scores.get(gyy));
        try {
            Field name = cls.getField("name");
            Field age = cls.getField("age");
            Field title = cls.getField("title");
            Field grade = cls.getField("grade");
            // Field scores = cls.getField("scores");
            // scores.setAccessible(true);
            System.out.println(name.get(gyy));
            System.out.println(age.get(gyy));
            System.out.println(title.get(gyy));
            System.out.println(grade.get(gyy));
            // System.out.println(scores.get(gyy));    
        } catch (Exception e) {
            // TODO: handle exception
            // logger.error(e);
            System.out.println(e);
        }
    }
}

class Student extends Person{
    public int grade;
    private int scores;

    public Student(String name, int age){
        super(name, age, "Student");
        switch (age) {
            case 6:
                this.grade = 1;
                break;
            case 7:
                this.grade = 2;
                break;
            case 8:
                this.grade = 3;
                break;
            case 9:
                this.grade = 4;
                break;
            case 10:
                this.grade = 5;
                break;
            case 11:
                this.grade = 6;
                break;
            default:
                break;
        }
    }
}

class Person {
    public String name;
    public int age;
    public String title;

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String title){
        this.name = name;
        this.age = age;
        this.title = title;
    }
}