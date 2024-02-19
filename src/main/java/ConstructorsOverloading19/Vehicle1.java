package ConstructorsOverloading19;

public class Vehicle1 {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("BMW",200000);
        Vehicle v2=new Vehicle("Mustang");
        new Vehicle("Ferrari","Petrol");
        new Vehicle(200000,"Audi");
        new Vehicle();
    }
}
