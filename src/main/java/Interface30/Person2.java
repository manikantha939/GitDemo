package Interface30;

public class Person2 implements Person1{
    @Override
    public void eat(){
        System.out.println("Eating");
    }

    public static void main(String[] args) {
        System.out.println(Person2.name);
        Person2 p2=new Person2();
        p2.eat();

    }
}
