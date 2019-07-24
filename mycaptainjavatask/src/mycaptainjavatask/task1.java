package mycaptainjavatask;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		float area, perimeter;
		System.out.println("enter the radius of the circle:");
		Scanner s = new Scanner(System.in);
		radius = s.nextInt();
		area = (float) (3.14*radius*radius);
		System.out.println("the area of the circle is:");
		System.out.println(area);
		perimeter = (float) (2*3.14*radius);
		System.out.println("the perimeter of the circle is:");
		System.out.println(perimeter);

	}

}
