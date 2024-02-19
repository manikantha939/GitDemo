package ConstructorChaining20;

public class A {
    A(double c){
        this(1);
        System.out.println(2);
    }
    A(int a){
        System.out.println(3);
    }

}
