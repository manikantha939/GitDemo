package MethodOverriding21;

public class Instagram3 extends Instagram2{
    @Override
    void upload() {
        super.upload();
        System.out.println("Upload Videos");
    }

    @Override
    void dm() {
        super.dm();
        System.out.println("DM Images");
    }

    void Story(){
        System.out.println("Upload Story");
    }
}
