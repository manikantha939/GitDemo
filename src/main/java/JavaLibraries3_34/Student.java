package JavaLibraries3_34;

public class Student {
    int age=0;
    Student(int age){
        this.age=age;
    }


    @Override
    public boolean equals(Object object){
        Student s=(Student) object;
        return this.age==s.age;
    }
    public static void main(String[] args) {
    Student s1=new Student(20);
    Student s2=new Student(21);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
