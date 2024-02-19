package ConstructorChaining20;

public class Test1 {
    double a;
    String b="xyz";
    Test1(double a){
        this();
        this.a=a;
        System.out.println(this.a);
    }
    Test1(){
        System.out.println("hi");
    }
}
