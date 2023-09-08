package basics;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	        boolean isPalindrome = true;
	        for (int i = 0; i < str.length() / 2; i++) {
	            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
	                isPalindrome = false;
	                break;
	            }
	        }
	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	

	}

}
