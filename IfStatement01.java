package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement01 {
	
  
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num=scan.nextInt();
		System.out.println("Eneter one more integer:");
		int num2=scan.nextInt();
		
		// 1. Example: Get a number from user . If the number is even, print "Even" on the console.	
		
		if(num%2==0)        
		{
			System.out.println( num + " is Even");
		}
	
		//2.Example: Get a number from user . If the number is odd, print "Odd" on the console.	
		
        if(num%2!=0)     //note: "!" is means not
        
        {
        	System.out.println(num+ " is Odd");
        }
		
		//3.Example: Get 2 number from user. ýf they equal to each other , print "Square" on the console
        
        if(num == num2)     //equal is ==
        
        {
        	System.out.println("Square, because " + num + "=" + num2);
        }
		
      scan.close();
	}

}
