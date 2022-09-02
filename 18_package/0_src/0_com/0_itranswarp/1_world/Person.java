package 18_package.0_src.0_com.0_itranswarp.1_world;

public class Person {
    public static int count=0;
    public String name;
    public int age;

    public static void GetCount(){
        count += 1;
    }

    public Person(){
        GetCount();
    }

    public Person(String name){
        this.name = name;
        GetCount();
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        GetCount();
    }
}
