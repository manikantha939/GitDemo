package Abstract29;

public abstract class Vehicle1 {
    abstract void start();

    Vehicle1(){
        System.out.println("Non Parameterized Abstract constructor");
    }

    void shiftGear(){
        System.out.println("shifting Gears");
    }
}
