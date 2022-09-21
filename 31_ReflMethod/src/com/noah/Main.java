package com.noah;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) throws Exception{
        Logger logger = LoggerFactory.getLogger(Main.class);
        Student yyc = new Student("noah", 10);

        logger.info("Reflection Method Test");
        Method N = yyc.getClass().getMethod("getName");
        Method G = Student.class.getMethod("getGrade");
        Method S = Student.class.getMethod("getScores");
        Method A = Student.class.getMethod("getAge");
        Method T = Student.class.getMethod("getTitle");

        System.out.println(N.invoke(yyc));
        System.out.println(G.invoke(yyc));
        System.out.println(S.invoke(yyc));
        System.out.println(A.invoke(yyc));
        System.out.println(T.invoke(yyc));

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

    public String getName(){
        System.out.println("Child method");
        return super.name;
    }

    public int getGrade(){
        return this.grade;
    }

    public int getScores(){
        return this.scores;
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

    public String getName(){
        System.out.println("Parent method");
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getTitle(){
        return this.title;
    }
}