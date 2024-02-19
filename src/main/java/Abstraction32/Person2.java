package Abstraction32;

public class Person2 extends Person1 {
    @Override
    void work(){
        System.out.println("Working");
    }

    public static void main(String[] args) {
//        Person2 p2=new Person2();
//        p2.work();
        Person1 p=new Person2();
        p.work();
    }
}
