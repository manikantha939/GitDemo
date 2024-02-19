package Abstract29;

public class Vehicle3 extends Vehicle2 {
    @Override
    void start() {
        System.out.println("Vehicle3 started");
    }
    Vehicle3(){
        super(10);
    }
    @Override
    void stop(){
        System.out.println("Vehicle3 is stopped");
    }

    //optionally we can override shiftGear()
    public static void main(String[] args) {
        Vehicle2 v3=new Vehicle3();
        v3.start();
        v3.stop();
        v3.shiftGear();
    }

}
