package basics;

import java.util.Scanner;

public class Q5Grade {

	public static void main(String[] args) {
		int Marks;
		// TODO Auto-generated method stub
		System.out.print("Enter the Student's Total Marks: ");
		Scanner sc = new Scanner(System.in);
		Marks= sc.nextInt();
		if (Marks>100)
			System.out.print("Invalid Input");
		else if (Marks==100)
		System.out.print("Grade S");
		else if (Marks>=90 && Marks<=99)
			System.out.print("Grade A ");
		else if (Marks>=80 && Marks<=89)
			System.out.print("Grade B ");
		else if (Marks>=70 && Marks<=79)
			System.out.print("Grade C ");
		else if (Marks>=60 && Marks<=69)
			System.out.print("Grade D ");
		else if (Marks>=50 && Marks<=59)
			System.out.print("Grade D ");
		else if (Marks<50)
			System.out.print("Grade F ");

	}

}
