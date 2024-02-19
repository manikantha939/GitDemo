package StaticAndNonStatic;

public class Student {
    static int age=20;

    static void study(){
        System.out.println("study");
    }

    public static void main(String[] args) {
        System.out.println(Student.age);//age
        Student.study();

        System.out.println("----------------------------------");

        System.out.println(age);//20
        study();
    }
}
