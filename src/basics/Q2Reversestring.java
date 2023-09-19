package basics;

import java.util.Scanner;

public class Q2Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // Read a string from the user
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Iterate through the characters of the input string in reverse order
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner
       sc.close();
	}

}
