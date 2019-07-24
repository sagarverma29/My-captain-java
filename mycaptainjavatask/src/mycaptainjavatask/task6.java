package mycaptainjavatask;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("enter a number of your choice:");
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		if(number>0)
		{
			System.out.println("it is a positive integer");
		}
		else if(number<0)
		{
			System.out.println("it is a negative integer");
		}
		else
		{
			System.out.println("it is a zero");
		}
	}

}
