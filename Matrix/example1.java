package Matrix;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Input matrix elements
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate perimeter
        int perimeter = calculatePerimeter(matrix, rows, columns);
        
        System.out.println("Perimeter of the matrix: " + perimeter);

        scanner.close();
    }

   
    private static int calculatePerimeter(int[][] matrix, int rows, int columns) {
        int perimeter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
               
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    perimeter += matrix[i][j];
                }
            }
        }

        return perimeter;
    }
}


