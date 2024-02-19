package Arrays22;

public class SumArray {
    public static void main(String[] args) {
        int [] a={10,20,30,40,50};
//        int a[]={10,20,30,40,50};
//        int []a={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];//Sum+=a[i];
        }
//        for (int i:a
//             ) {
//            sum=sum+i;
//        }
        System.out.println("Sum of the Array is: "+sum);
        System.out.println("avaerage of the Array is: "+(sum/a.length));
    }
}
