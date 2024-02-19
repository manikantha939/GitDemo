package PackagesAccess23;

public class Protected2 {
    public static void main(String[] args) {
        Protected1 p1=new Protected1();
        System.out.println(p1.a);
        p1.protected1();
    }
}
