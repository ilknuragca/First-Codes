package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement02 {

	//Note: ýf you want to compare the values of 2 strings use "equals()", do not use "=="
	// "equals()" check just the values of the strings but "==" checks the values and addresses of the string
	
	public static void main(String[] args) {
		//Ask user to enter any day name , then print if it is "week day" or "weekend day"
		
	    Scanner scan=new Scanner(System.in);
        System.out.println("Enter a day name..");
        String dayName=scan.next();
        
    /*    if(dayName.equals("Monday")  )       // Don't use == for string  
        {
         System.out.println("Week day");	
        }
        
	     if(dayName.equals("Tuesday") )
	     {
	    	System.out.println("Week day"); 
	     }
	    
	     if(dayName.equals("Wednesday")) 
	     {
	    	System.out.println("Week day"); 
	     }
	     
	     if(dayName.equals("Thursday")) 
	     {
	    	System.out.println("Week day"); 
	     }
	     
	     if(dayName.equals("Friday")) 
	     {
	    	System.out.println("Week day"); 
	     }
	     
	     if(dayName.equals("Saturday")) 
	     {
	    	System.out.println("Weekend day"); 
	     }
	     
	     if(dayName.equals("Sunday")) 
	     {
	    	System.out.println("Weekend day"); 
	     }
	     
	 */    //the way very long and very repetition    
	     
        if(dayName.equals("Monday") || dayName.equals("Tuesday") || dayName.equals("Wednesday")||dayName.equals("Thursday") || dayName.equals("Friday"))      
       // "||" one of them true so conditional is true 
         {
         System.out.println("Week day");	
        }
	      if(dayName.equals("Saturday") || dayName.equals("Sunday"))
	      {
	    	  System.out.println("Weekend day");
	      }
	      
	      
	  /* if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday")||dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday"))      
	          // "||" one of them true so conditional is true 
	            {
	            System.out.println("Week day");	
	           }
	   	      if(dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday"))
	   	      {
	   	    	  System.out.println("Weekend day");
	   	      }
	   	      
	    */   // equalsIgnoreCase() checks in the string by ignoring cases. when u use ignorecase methods uppercase or lowercase are same 
	      
	      
	      
 /*   if(!dayName.equals("Monday") || !dayName.equals("Tuesday") || !dayName.equals("Wednesday")|| !dayName.equals("Thursday") || !dayName.equals("Friday"))      
	      {
	    	  System.out.println("You don't write day");
	      }
	      
	//!!!it's very long
	 * */
	      
	      else {       ///so use "else"
	    	  System.out.println("Hey user, I told you to enter day name , What did you enter?");
	      }
	      

	      
	      //but we use else and java message "hey user..."
	      //so we use else if
	      //if the 1. conditional is true executed that code and then java will not 2. conditional ==> else if
	      
	  /*    if(dayName.equals("Monday") || dayName.equals("Tuesday") || dayName.equals("Wednesday")||dayName.equals("Thursday") || dayName.equals("Friday"))      
	          // "||" one of them true so conditional is true 
	            {
	            System.out.println("Week day");	
	             }
	   	     else if(dayName.equals("Saturday") || dayName.equals("Sunday"))
	   	      {
	   	    	  System.out.println("Weekend day");
	   	      }
	   	      else {
	    	  System.out.println("Hey user, I told you to enter day name , What did you enter?");
	      }
	      */
	      scan.close();
	}

}
