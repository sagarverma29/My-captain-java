package mycaptainjavatask;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, j=0;
		int first[][] = new int[2][2];
		int second[][] = new int[2][2];
		int sum[][] = new int[2][2];
		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements for the frist array:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				first[i][j] = in.nextInt();
		}
		System.out.println("enter the elements for the second array:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				second[i][j] = in.nextInt();
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				sum[i][j] = first[i][j]+second[i][j];
			}
		}
		System.out.println("the sum of the arrays is:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				System.out.print(sum[i][j]+"\t");
			
		        System.out.println();
		}
		}

}
