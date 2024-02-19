package PackagesAccess23;

import Constructors.Variable;

public class Public2 {
    public static void main(String[] args) {
        Public1 p1=new Public1();
        System.out.println(p1.variable);
        System.out.println(p1.var);
        p1.method();
    }
}
