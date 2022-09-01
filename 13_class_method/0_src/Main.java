public class Main {
    public static void main(String[] args) {
        Person Gyy = new Person("GuoYiYue",28);
        // Gyy.SetName("GuoYiYue");
        // Gyy.SetAge(28);
        System.out.println(Gyy.GetName());
        System.out.println(Gyy.GetAge());
    }
}
class Person{
    private String name;
    private int age;
    
    public Person(){
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void SetName(String name) {
        this.name = name;
    }
    public String GetName() {
        return this.name;
    }
    public void SetAge(int age) {
        this.age = age;
    }

    public int GetAge() {
        return this.age;
    }
}    
