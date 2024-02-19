package Abstract29;

public abstract class Vehicle2 extends Vehicle1{
    abstract void stop();
    int a;
    Vehicle2(int value){
        this.a=value;
        System.out.println("Abstract parameterized constructor: "+a);
    }
}
