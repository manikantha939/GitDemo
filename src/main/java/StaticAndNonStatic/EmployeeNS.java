package StaticAndNonStatic;

public class EmployeeNS {
    int id;
    {
        System.out.println("initialized the id to 10");
        id=10;
    }
    public static void main(String[] args) {
        EmployeeNS e=new EmployeeNS();
        System.out.println("Id: "+e.id);
    }
    {
        System.out.println("initialized the id to 20");
        id=20;
    }
//    {
//        System.out.println("age is: "+id);
//        System.out.println("variable value is assigned");
//    }
}
