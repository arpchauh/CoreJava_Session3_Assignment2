package tanaji;

import java.util.*;

public class Session3_Assignment2 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.next();

		System.out.println("Enter the second string");
		String s2 = sc.next();

		if (s2.equals(s1)) 
		{
			System.out.println("The given string s1 and s2 are same :" +true);
		} 
		else 
		{
			System.out.println("The given string s1 and s2 are not same :" +false);
		}

	}

}
