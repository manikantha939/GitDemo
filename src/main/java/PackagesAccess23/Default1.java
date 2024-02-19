package PackagesAccess23;

class Default1 {
    static int a=20;
    Default1(){
        System.out.println("Default Constructor");
    }
    static void develop(){
        System.out.println("Develop An Software Application");
    }
    public static void main(String[] args) {
        Default1 d1=new Default1();
        System.out.println(d1.a);
        d1.develop();
    }
}
