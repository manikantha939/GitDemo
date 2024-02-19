package ConstructorChaining20;

public class B extends A{
    B(){
        super(1.0);
        System.out.println(1);
    }
    B(int b){
        this();
        System.out.println(4);
    }

}
