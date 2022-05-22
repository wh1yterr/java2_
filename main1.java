import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = scan.nextInt();
        double[] arr = new double[n];
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 12));
        }
        System.out.println(Arrays.toString(arr));
 
        int[] arrEnd = new int[arr.length];
        int counterForArray = 0;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (double v : arr) {
                if (arr[i] == v) {
                    counter++;
                }
            }
            if (counter == 1) {
                arrEnd[counterForArray] = i;
                counterForArray++;
            }
        }
        arrEnd = Arrays.copyOf(arrEnd, counterForArray);
 
        System.out.println(Arrays.toString(arrEnd));
    }
}
