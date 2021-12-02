package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement03 {
	/*
	 * Type code to print the seasons after getting month names from user 
	 */
		public static void main(String[] args) {
			
			 Scanner scan=new Scanner(System.in);
		        System.out.println("Enter a month name..");
		        String monthName=scan.next();
		        
		        if(monthName.equalsIgnoreCase("December") || monthName.equalsIgnoreCase("January") || monthName.equalsIgnoreCase("February"))
		        {
		        	System.out.println( monthName + " is winter");
		        }else if(monthName.equalsIgnoreCase("March") || monthName.equalsIgnoreCase("April") || monthName.equalsIgnoreCase("May"))   
		        {
		        	System.out.println( monthName + " is spring");
		        }
		        else if(monthName.equalsIgnoreCase("June") || monthName.equalsIgnoreCase("July") || monthName.equalsIgnoreCase("August"))   
		        {
		        	System.out.println( monthName + " is summer");
		        }
		        else if(monthName.equalsIgnoreCase("September") || monthName.equalsIgnoreCase("October") || monthName.equalsIgnoreCase("November"))   
		        {
		        	System.out.println( monthName + " is fall");
		        }
		        else{
		        	System.out.println("Are you sure " + monthName + " is a month?");
		        }
		        //java find true conditional and than java doesn't read other conditional.  for "else if"
		        scan.close();
		}

}
