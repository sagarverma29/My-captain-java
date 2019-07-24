package mycaptainjavatask;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0, i=0, cube=0;
		System.out.print("enter the range :");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(i=1;i<=n;i++)
		{
			cube=i*i*i;
			System.out.println("The cube of "+i+" is :"+cube);
		}
		

	}

}
