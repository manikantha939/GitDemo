package MethodOverriding21;

public class Son1 extends Father1{
    @Override
    void Bike(){
        super.Bike();
        System.out.println("New modified Son's bike");
    }
}
