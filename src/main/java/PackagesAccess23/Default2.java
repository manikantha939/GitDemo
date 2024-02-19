package PackagesAccess23;

public class Default2 {
    public static void main(String[] args) {
        Default1 d1=new Default1();
        System.out.println(d1.a);
        d1.develop();
        System.out.println(Default1.a);
        Default1.develop();

    }
}
