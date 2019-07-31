package mycaptainjavatask;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes=0;
		int years=0, days=0, hours=0;
		System.out.print("enter time in minutes :");
		Scanner s = new Scanner(System.in);
		minutes = s.nextInt();
		years=minutes/525600;
		days=(minutes%525600)/1440;
		hours=(minutes%1440)/60;
		System.out.print(minutes+" minutes is equal to "+years+" years "+days+" days "+hours+" hours");

	}

}
