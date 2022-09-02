public class Main {
    public static void main(String[] args) {
        Person GYY = new Person("GUOYIYU", 28);
        Person YYC = new Person("YANGYICONG");
        Person DB = new Person();
        System.out.println(Person.count);
    }    
}

class Person{
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