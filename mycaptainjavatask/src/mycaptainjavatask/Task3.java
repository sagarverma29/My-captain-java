package mycaptainjavatask;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		long n=0,sum=0;
		System.out.print("enter a number of your choice : ");
		Scanner s = new Scanner(System.in);
		n = s.nextLong();
		while(n>0)
		{
			i = (int) (n % 10);
			sum = sum+i;
			n = n/10;
		}
		System.out.print("the sum of digits is : "+sum);
		

	}

}
