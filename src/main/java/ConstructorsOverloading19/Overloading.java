package ConstructorsOverloading19;

public class Overloading {
    int id;
    double price;
    String name;
    Overloading(int id, double price, String name){
        this.id=id;
        this.price=price;
        this.name=name;
    }
    Overloading(int id, String name){
        this.id=id;
        this.name=name;
    }
    Overloading(String name,int id){
        this.id=id;
        this.name=name;
    }
    Overloading(String name){
        this.name=name;
    }
    void display(){
        System.out.println("overloading id: "+ id);
        System.out.println("overloading name "+ name);
        System.out.println("overloading price "+price);
    }
    public static void main(String[] args) {
        Overloading e1=new Overloading(1001, 10, "Soap truck");
//        Overloading e2=new Overloading(1001,"colgate truck");
//        Overloading e3=new Overloading( "banana truck", 2001);
//        Overloading e4=new Overloading("apple truck");
        e1.display();
//        System.out.println("----------------------------");
//        e2.display();
//        System.out.println("----------------------------");
//        e3.display();
//        System.out.println("----------------------------");
//        e4.display();
//        System.out.println("----------------------------");
//
    }

}
