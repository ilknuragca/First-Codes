package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement01 {
	
  /*    
       "If it rains , I will cancel the picnic." in English
       "If (it rains) { I will cancel the picnic}" in java, all keyword are in lowercase.(package,public,class, static, void)
                                                            ýf is keyword. so if is lowercase
                                                            
    Note: the code to check if a number is even or not ==> number%2==0      = assignment operator    == equal                                             
  
  */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num=scan.nextInt();
		System.out.println("Eneter one more integer:");
		int num2=scan.nextInt();
		
		// 1. Example: Get a number from user . If the number is even, print "Even" on the console.	
		
		if(num%2==0)        //Note: even numbers are divisible by 2.  when you divide a number by 2, remainder will be 0. 
			               // so ýf you need to check remainder . you have to use modules operator.
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
