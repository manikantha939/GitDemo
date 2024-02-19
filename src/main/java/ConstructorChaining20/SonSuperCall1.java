package ConstructorChaining20;

public class SonSuperCall1 extends FatherSuperCall1 {
    SonSuperCall1(){
//        super();
        super(1);
        System.out.println(2);
    }
}
