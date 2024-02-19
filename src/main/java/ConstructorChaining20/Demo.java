package ConstructorChaining20;

public class Demo {
    Demo(){
        this(2);
        System.out.println(1);
    }
    Demo(int a){
        System.out.println(2);
    }

    public static void main(String[] args) {

        System.out.println("Start");
        Demo d=new Demo();
        System.out.println("End");
    }
}
