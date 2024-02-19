package PackagesAccess234;

import PackagesAccess23.Protected1;

public class Protected3 extends Protected1{
    public static void main(String[] args) {
        Protected3 p1=new Protected3();
        System.out.println(p1.a);
        p1.protected1();

    }
}
