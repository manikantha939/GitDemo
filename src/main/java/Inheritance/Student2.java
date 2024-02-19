package Inheritance;

public class Student2 {
    public static void main(String[] args) {
        Department2 d=new Department2();
        System.out.println("University Name: "+d.collegename);
        System.out.println("College Name: "+d.departmentName);
        System.out.println("department Name: "+d.universityName);

        d.conductExams();
        d.fest();
        d.providePlacements();
    }
}
