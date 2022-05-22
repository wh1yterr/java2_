import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {

        System.out.print("Enter the matrix size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[][] matrix = new double[size][size];
 

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ((int)(Math.random() * 12));
            }
        }
 

        System.out.println("Matrix before: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
 

        double min = Double.MAX_VALUE;
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--){
                if (i == j) {
                    break;
                }
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
 
        System.out.printf("Answer: %s", min);
    }
}
