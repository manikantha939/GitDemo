package Polymorphisam28;

public class RunTimePolymorphisam1 extends RunTimePolymorphisam{
    @Override
    void Start() {
//        super.Start();
        System.out.println("Bike started");
    }

    public static void main(String[] args) {
        RunTimePolymorphisam rtp=new RunTimePolymorphisam1();
        rtp.Start();
    }
}
