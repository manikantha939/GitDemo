package Interface30;

public class EmployeeTest extends Employee2 implements Employee1, Employee {
    @Override
    public void work(){
        System.out.println("Working");
    }
    @Override
    public void develop(){
        System.out.println("Developing");
    }
    public void d(){
        System.out.println("ttttt");
    }

    public static void main(String[] args) {
        EmployeeTest et=new EmployeeTest();
        et.develop();
        et.work();
        et.Test();
        System.out.println(EmployeeTest.salary);//Employee.salary
        System.out.println(name);//Employee.name
        System.out.println(et.id);
    }

}
