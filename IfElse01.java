package day05nestedifternary;

import java.util.Scanner;

public class IfElse01 {
/*
 * Type java code by using if-else if() statement
 * Write a program to check if a year is leap year or not
 * If the year is divisible by 100 then it must be divisible by 400 ==>1600 is leap , 1700 is not
 * If a year is not divisible by 100 then it must be divisible by 4. ==>2004 is leap year, but 2007 is not 
 */
	
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a year to learn if it is leap year or not..");
		int year=scan.nextInt();
		
		if(year<=0) {
			System.out.println("The year must be more than zero");
		}
		else if(year%100==0 && year%400==0) //&&==and  
		{
			System.out.println(year+ " is a leap year");
		}
		else if(year%100 !=0 && year%4==0)
		{
			System.out.println(year+ " is a leap year");
		}
		else
		{
			System.out.println(year + " is not leap year");
		}
		scan.close();
	}

}
