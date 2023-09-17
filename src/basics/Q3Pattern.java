package basics;

import java.util.Scanner;

public class Q3Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of rows:  ");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int currentNumber=1;
		for(int i=1;i<=rows;i++)
		{	for(int j=1;j<=i;j++)
		{
			System.out.print(currentNumber+" ");
			currentNumber++;
		}
		System.out.println();
		}

	}

}
