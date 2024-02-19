package ConstructorsOverloading19;

public class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
   void display(){
       System.out.println("Employee id: "+id);//this.id
       System.out.println("Employee name: "+name);//this.name
       System.out.println("Employee salary: "+salary);//this.salary
    }

    public static void main(String[] args) {
        Employee e1=new Employee(1001,"dinga",100000.0);
        Employee e2=new Employee(1002,"gunda",200000.0);
        Employee e3=new Employee(1003,"manga",300000.0);
        Employee e4=new Employee(1003,"manga",300000.0);

        System.out.println("Employee Details");
        System.out.println("============================================================");
        e1.display();
        System.out.println("------------------------------------------------------------");
        e2.display();
        System.out.println("------------------------------------------------------------");
        e3.display();
        System.out.println("------------------------------------------------------------");
        e4.display();
    }
}
