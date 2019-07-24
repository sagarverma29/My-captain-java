package mycaptainjavatask;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowel=0, con=0;
		System.out.print("Enter a string :");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				vowel++;
			else
				con++;
		}
		System.out.println("number of vowels :"+vowel);
		System.out.println("number of consonant :"+con);
		

	}

}
