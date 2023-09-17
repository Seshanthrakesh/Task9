package basics;

import java.util.Scanner;

public class Q6HotelTrafiic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month,days;
		double roomRent=1000.00;
		Q6HotelTrafiic pm = new Q6HotelTrafiic();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Month in Number ");
		month=sc.nextInt();
		System.out.print("Enter the Number of days stayed:  ");
		days=sc.nextInt();
		switch (month) {
		case 4:
		case 6:
		case 11:
		case 12:
			System.out.println("It is peak Season .Room rent is 20% higher.");
			roomRent*=1.2*days;
			break;
		default:
			System.out.println("Is Not Peak Season .Room Rent remains the same.");
			roomRent*=days;
			break;
		}	

		System.out.println("Estimated hotel Traffic for the month : "+month);
		System.out.printf("Room rent :%.2f%n",roomRent);
	}

}
