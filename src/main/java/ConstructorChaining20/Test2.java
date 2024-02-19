package ConstructorChaining20;

public class Test2 extends Test1 {
    Double c;
    Test2(double a){
        super(1);
        this.c=a;
        System.out.println(super.b);
        System.out.println(c);
    }
    Test2(){
        this(1.0);
        System.out.println("hello");
    }
}
