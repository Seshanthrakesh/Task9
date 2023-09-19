package basics;

import java.util.Scanner;

public class Q6HotelTrafiic {
	int month,days;
	double roomRent=1000.00;
	public void  NormalSeason()
	{
		System.out.println("Is Not Peak Season .Room Rent remains the same.");
		roomRent*=days;
	}
	public void PeakSeason()
	{
		System.out.println("It is peak Season .Room rent is 20% higher.");
		roomRent*=1.2*days;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Q6HotelTrafiic obj =  new Q6HotelTrafiic();
		//Q6HotelTrafiic pm = new Q6HotelTrafiic();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Month in Number ");
		obj.month=sc.nextInt();
		if (obj.month<13)
		{
		System.out.print("Enter the Number of days stayed:  ");
		obj.days=sc.nextInt();
		switch (obj.month) {
		case 1:
			obj.NormalSeason();
			break;
		case 2:
			obj.NormalSeason();
			break;
		case 3:
			obj.NormalSeason();
			break;
		case 4:
			obj.PeakSeason();
			break;
		case 5:
			obj.NormalSeason();
			break;
		case 6:
			obj.PeakSeason();
			break;
		case 7:
			obj.NormalSeason();
			break;
		case 8:
			obj.NormalSeason();
			break;
		case 9:
			obj.NormalSeason();
			break;
		case 10:
			obj.NormalSeason();
			break;
		case 11:
			obj.PeakSeason();
			break;
		case 12:
			obj.PeakSeason();
		break;
		default:
			System.out.println("Enter the Valid Month");
			break;
		}	
		
		System.out.println("Estimated hotel Traffic for the month : "+obj.month);
		System.out.printf("Room rent :%.2f%n",obj.roomRent);
	}
		else
			System.out.println("Enter Valid month");
}
}
