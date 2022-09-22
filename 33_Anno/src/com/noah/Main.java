package com.noah;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args){
        Teacher gyy = new Teacher("ida", 28, "female", "Design Art of Furniture", 3000.0);
        Student yyc = new Student("noah", 28, "male");
        try {
            check(gyy);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        try {
            check(yyc);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    static void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
        for (Field field : person.getClass().getFields()){
            Range range = field.getAnnotation(Range.class);
            if(range != null){
                Object value = field.get(person);
                if(value instanceof String){
                    String s = (String) value;
                    if(s.length() < range.min() || s.length()> range.max()){
                        throw new IllegalArgumentException("Invalid String length of "+field.getName());
                    }
                }
                if(value instanceof Integer){
                    int i = (int) value;
                    if(i < range.min() || i > range.max()){
                        throw new IllegalArgumentException("Invalid integer value of "+field.getName());
                    }
                }
                if(value instanceof Float){
                    double d = (double) value;
                    if(d < (double)range.min() || d > (double)range.max()){
                        throw new IllegalArgumentException("Invalid float value of "+field.getName());
                    }
                }
            }
        }
    }
}

class Person{
    public String name;
    @Range(min=0, max=100)
    public int age;
    @Range(min=1, max=20)
    public String post;
    public String sex;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, String post){
        this.name = name;
        this.post = post;
        this.age = age;
    }
    public Person(String name, int age, String post, String sex){
        this.name = name;
        this.age = age;
        this.post = post;
        this.sex = sex;
    }
}

/**
 * Salary
 */
interface Salary {
    public double getSalary();
    public void setSalary(double salary);   
}

class Student extends Person{
    @Range(min=1, max=9)
    public int grade;

    public Student(String name, int age, String sex){
        super(name, age, "Student", sex);
        this.grade = switch (age) {
            case 6 -> 1;
            case 7 -> 2;
            case 8 -> 3;
            case 9 -> 4;
            case 10 -> 5;
            case 11 -> 6;
            case 12 -> 7;
            case 13 -> 8;
            case 14 -> 9;
            default -> 0;
        };
    }
}

class Teacher extends Person implements Salary{
    @Range(min=3000, max=100000)
    public double salary;
    @Range(min=1, max=50)
    public String course;

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public Teacher(String name, int age, double salary){
        super(name, age, "Teacher");
        this.salary = salary;
    }
    public Teacher(String name, int age, String sex, double salary){
        super(name, age, "Teacher", sex);
        this.salary = salary;
    }
    public Teacher(String name, int age, String sex, String course, double salary){
        super(name, age, "Teacher", sex);
        this.salary = salary;
        this.course = course;
    }
}

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Range{
    int min() default 0;
    int max() default 60;
}

