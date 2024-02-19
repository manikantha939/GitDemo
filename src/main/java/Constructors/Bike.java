package Constructors;

public class Bike {
//Parameterized custom constructor
    Double price;
    Bike(Double value){
        price=value;
        System.out.println("Value of the bike is: "+price);
    }
    public static void main(String[] args) {
        System.out.println("Execution stated");
        Bike b=new Bike(20000.0);
        Bike b1=new Bike(30000.0);
        System.out.println(b.price+" "+b1.price);
        System.out.println("Execution ends");


    }
}
