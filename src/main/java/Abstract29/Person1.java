package Abstract29;

public class Person1 extends Person {
    @Override
    void work(){
        System.out.println("Execute the concrete method");
    }

    public static void main(String[] args) {
        Person p1=new Person1();
        p1.work();
        p1.concrete();
    }
}
