package Map;

import java.util.ArrayList;
import java.util.Scanner;

public class vowelfinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find vowels in the string and store them in an ArrayList
        ArrayList<Character> vowels = findVowels(inputString);

        // Display the result
        System.out.println("Vowels in the string: " + vowels);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Function to find vowels in a given string
    private static ArrayList<Character> findVowels(String input) {
        // Create an ArrayList to store vowels
        ArrayList<Character> vowelList = new ArrayList<>();

        // Convert the input string to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the current character is a vowel (a, e, i, o, u)
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
                    || currentChar == 'o' || currentChar == 'u') {
                // Add the vowel to the ArrayList
                vowelList.add(currentChar);
            }
        }

        // Return the ArrayList containing vowels
        return vowelList;
    }


	}


