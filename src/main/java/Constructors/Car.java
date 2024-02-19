package Constructors;

public class Car {
    //Non-Parameterized custom constructor
    Car(){
        System.out.println("constructor got executed");
    }

    public static void main(String[] args) {
        System.out.println("Execution starts");
        Car c=new Car();
        System.out.println("Execution ends");
    }
}
