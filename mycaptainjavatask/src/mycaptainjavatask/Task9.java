package mycaptainjavatask;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0;
		System.out.print("enter the first number :");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		System.out.print("enter the second number :");
		Scanner s1 = new Scanner(System.in);
		b = s1.nextInt();
		System.out.print("enter the third number :");
		Scanner s2 = new Scanner(System.in);
		c = s2.nextInt();
		if(a>b && a>c)
		{
			System.out.print(a+" is the largest number");
	    }
		else if(b>a && b>c)
		{
			System.out.print(b+" is the largest number");
		}
		else if(c>a && c>b)
		{
			System.out.print(c+" is the largest number");
		}

	}

}
