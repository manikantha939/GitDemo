package ConstructorsOverloading19;

public class Vehicle {
    Vehicle(String brand, int cost){
        System.out.println("Brand: "+brand+" Cost: "+cost);
    }
    Vehicle(String brand){
        System.out.println("Brand: "+brand);
    }
    Vehicle(){
        System.out.println("No Argument constructor");
    }
    Vehicle(String brand, String fuel){
        System.out.println("Brand: "+brand+" Fuel: "+fuel);
    }
    Vehicle(int cost, String brand){
        System.out.println("Cost: "+cost+" Brand: "+brand);
    }
}
