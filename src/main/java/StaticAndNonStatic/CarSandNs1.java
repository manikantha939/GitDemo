package StaticAndNonStatic;

public class CarSandNs1 {
    static{
        System.out.println(1);
    }
    public static void main(String[] args) {
        System.out.println(2);
        CarSandNs1 cs=new CarSandNs1();
    }
    {
        System.out.println(3);
    }
}
