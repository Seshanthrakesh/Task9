package basics;

import java.util.Scanner;

public class Q4Star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the X (odd number): ");
        int size = scanner.nextInt();
        
        if (size % 2 == 0) {
            System.out.println("Please enter an odd number for the size.");
            return;
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
	}

