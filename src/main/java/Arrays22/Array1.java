package Arrays22;

public class Array1 {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println("--------------------");
        for (int s:a
             ) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
