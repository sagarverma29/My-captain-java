package mycaptainjavatask;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inches;
		float meter;
		System.out.println("enter the dimensions in inches:");
		Scanner s = new Scanner(System.in);
		inches = s.nextInt();
		meter = (float)(inches/39.37);//since 1 meter is equal to 39.37 inches
		System.out.println("the dimensions in meter are:");
		System.out.println(meter);

	}

}
