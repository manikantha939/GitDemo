package Arrays22;

public class ArrayOccurrence {
    public static void main(String[] args) {
//        int []array={20,10,20,30,40};
//        for (int i=0;i<a.length;i++){
//            int count=0;
//            for(int j=i+1;j<a.length;j++){
//                if(a[i]==a[j]){
//                    count++;
//                }
//            }
//            System.out.println(a[i]+" number of occurrence is: "+ count);
//        }
        int[] array = {10, 20, 30, 40, 20, 50};

        // Create a frequency array to store the occurrences of each element
        int[] frequency = new int[6]; // Assuming the array elements are between 0 and 9

        // Count occurrences using a single for loop and if block
        for (int i : array) {
            if (i >= 0 && i <= 90) { // Check if the element is within the expected range
                frequency[i]++;
            }
        }
        // Display the occurrences
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Element " + i + " occurs " + frequency[i] + " times.");
            }
        }
    }
}
