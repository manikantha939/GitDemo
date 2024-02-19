package MethodOverriding21;

public class Car2 extends Vehicle2 {

    @Override
    void start() {
        System.out.println("Car Started");
    }

    void shiftGear(){
        System.out.println("Gears shifted");
    }



    public static void main(String[] args) {
        Car2 c=new Car2();
        c.start();
    }

}
