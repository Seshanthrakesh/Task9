package basics;

import java.util.Scanner;

public class Q7LargestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Number:  ");
		num1=sc.nextInt();
		System.out.print("Enter the Second Number:  ");
		num2=sc.nextInt();
		System.out.print("Enter the Third Number:  ");
		num3=sc.nextInt();
		if(num1>=num2 && num1>=num3)
			System.out.println(" First number is Greater");
		 if(num2>=num1 && num2>=num3)
			System.out.println(" second number is Greater");
		 if(num3>=num1 && num3>=num2)
			System.out.println(" Third number is Greater");
		else
			System.out.println("Enter valid input");
		
		
		
		
	}

}
