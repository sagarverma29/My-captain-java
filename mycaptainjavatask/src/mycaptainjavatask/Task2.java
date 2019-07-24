package mycaptainjavatask;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long b1, b2;
		int i=0;
		int remainder=0;
		int[] sum = new int[20];
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first binary number :");
		b1 = s.nextLong();
		System.out.println("enter the second binary number :");
		b2 = s.nextLong();
		while(b1!=0 || b2!=0)
		{
			sum[i++]=(int)((b1%10 + b2%10 + remainder)%2);
			remainder=(int)((b1%10 + b2%10 + remainder)/2);
			b1 = b1/10;
			b2 = b2/10;
		}
		if(remainder!=0)
		{
			sum[i++]=remainder;
		}
		i--;
		System.out.print("sum of two binary number is :");
		while(i>=0)
		{
			System.out.print(sum[i--]);
		}
		
		

	}

}
