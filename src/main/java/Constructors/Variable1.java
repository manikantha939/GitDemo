package Constructors;

public class Variable1 {
    int age;
    String name;
    Variable1(int age, String name ){
        System.out.println(this.age=age);
        System.out.println(this.name=name);
    }

    public static void main(String[] args) {
        Variable1 v1=new Variable1(100, "raju");
        Variable1 v2=new Variable1(200, "gunda");

        System.out.println(v1.age+"  "+ v1.name);
        System.out.println(v2.age+"  "+ v2.name);
    }
}
