package Matrix;

import java.util.Scanner;

public class example4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter viva scores separated by space:");
        String input = scanner.nextLine();

        // Split the input into an array of integers
        String[] scoresArray = input.split(" ");
        int[] scores = new int[scoresArray.length];

        // Convert string values to integers
        for (int i = 0; i < scoresArray.length; i++) {
            scores[i] = Integer.parseInt(scoresArray[i]);
        }

        // Calculate and display the output
        System.out.print("Output: ");
        for (int score : scores) {
            int result = Math.max(0, score - 2);
            System.out.print(result + " ");
        }

        scanner.close();
    }
}

