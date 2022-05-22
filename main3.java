import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {

        System.out.print("Enter the row size: ");
        Scanner scan = new Scanner(System.in);
        int sizeRow = scan.nextInt();
        System.out.print("Enter the column size: ");
        int sizeColumn = scan.nextInt();
        double[][] matrix = new double[sizeRow][sizeColumn];
 

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ((int)(Math.random() * 12));
            }
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
 

        System.out.print("Enter the row: ");
        int rowNumber = scan.nextInt() - 1;
        int answer = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            if (i == matrix[rowNumber].length - 1) {
                break;
            }
            if (matrix[rowNumber][i] <= matrix[rowNumber][i + 1]) {
                answer = 1;
            } else {
                answer = 0;
                break;
            }
        }
        System.out.printf("Answer = %s", answer);
    }
}
