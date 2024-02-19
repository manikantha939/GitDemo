package PackagesAccess23;

public class Protected1 {
    protected int a=10;
    protected Protected1(){
        System.out.println("Protected Constructor");
    }
    protected void protected1(){
        System.out.println("Protected Method");
    }

    public static void main(String[] args) {
        Protected1 p1=new Protected1();
        System.out.println(p1.a);
        p1.protected1();
//        Private p=new Private();
//        System.out.println(p.getA());
    }
}
