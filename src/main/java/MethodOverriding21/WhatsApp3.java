package MethodOverriding21;

public class WhatsApp3 extends WhatsApp2{
    @Override
    void display() {
        super.display();
        System.out.println("Blue Ticks Supported");
    }
    @Override
    void call() {
        super.call();
        System.out.println("Video Call Supported");
    }
    void story(){
        System.out.println("Can Upload Images as Story");
    }
}
