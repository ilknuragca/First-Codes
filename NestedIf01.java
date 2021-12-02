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
/*
 * Note: Every character in a string has index. 
 *        Indexes start from zero so the index of first character is zero.
 *        Index of last character in a String equals "the number of characters - 1"
 */
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the password ");
	String pwd=scan.next();
	 
	char firstName=pwd.charAt(0); /// tüm pwd.charAt(0) yerine firstName yaz. böylece her seferinde java method çalýþtýrmaz
	                              // böyle çalýþmasý daha hýzlý olur
	                          //methods will work just one . java just one will go to the String at get character
	if(pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') //indexes start from zero----charAt(0)==>                        
		                                         //look at the 1.character from index. charAt(1)==>2.character    
	{                                                                                                             
		if(pwd.charAt(0)=='A')                                            //is the "Nested if" statement                                             
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
