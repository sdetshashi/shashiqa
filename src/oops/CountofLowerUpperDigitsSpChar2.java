package oops;

import java.util.Scanner;

public class CountofLowerUpperDigitsSpChar2
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		//way-2
		//count variables
		int clc=0;
		int cuc=0;
		int cd=0;
		int csc=0;
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(Character.isLowerCase(y))
			{
				clc++;
			}
			else if(Character.isUpperCase(y))
			{
				cuc++;
			}
			else if(Character.isDigit(y))
			{
				cd++;
			}
			else
			{
				csc++;
			}
		}
		System.out.println("lowercase alphabet count is: "+clc);
		System.out.println("Upperercase alphabet count is: "+cuc);
		System.out.println("Digit count is: "+cd);
		System.out.println("Special char count is: "+csc);

	}

}
