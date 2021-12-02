package day05nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
	/*
	     Ask user to enter a password
	     
	     If the initial of the passwords is uppercase than check if it is 'A' or not
	     If it is 'A' the output will be "Valid Password"
	     otherwise the output will be "Invalid Password"
	     For ex; Ali==> Valid Password   -   ali==>Invalid  -  Mark==> Invalid
	     
	     If the initial of the passwords is lowercase then check if it is 'z' or not
	     If it is 'z' the output will be "Valid Password"
	     otherwise the output will be "Invalid Password"
	     For ex; zoe==> Valid Password   -  Zoe==>Invalid   -  John ==> Invalid
	 */

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the password ");
	String pwd=scan.next();
	 
	char firstName=pwd.charAt(0); 
	if(pwd.charAt(0)>='A' && pwd.charAt(0)<='Z')    
	{                                                                                                             
		if(pwd.charAt(0)=='A')                                                                                      
		{
			System.out.println(pwd + " is a valid password");
		} 
		else {
			System.out.println(pwd + " is not a valid password");
		}
	}
	else if(pwd.charAt(0)>='a' && pwd.charAt(0)<='z') 
	{		
		  if(pwd.charAt(0)=='z') {
				System.out.println(pwd + " is a valid password");
		} else {
			System.out.println(pwd + " is not a valid password");
		}
		  
	} else
	{
		 System.out.println("First character should be letter");
	}
	scan.close();	
	}

}
