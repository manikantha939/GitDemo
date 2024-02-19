package StaticAndNonStatic;

public class CarSandNS {
    static int id;
    double price;
    {
        price=1000;
    }
    public static void main(String[] args) {
        System.out.println("execution starts");
        CarSandNS s=new CarSandNS();
        id=10;
        System.out.println("id of the car: "+CarSandNS.id);
        System.out.println("price of the car: " + s.price);
        System.out.println("execution ends");
    }

}
