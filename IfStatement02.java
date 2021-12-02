package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement02 {

	
	
	public static void main(String[] args) {
		//Ask user to enter any day name , then print if it is "week day" or "weekend day"
		
	    Scanner scan=new Scanner(System.in);
        System.out.println("Enter a day name..");
        String dayName=scan.next();
        
    /*    if(dayName.equals("Monday")  )         
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
	
	      else {      
	    	  System.out.println("Hey user, I told you to enter day name , What did you enter?");
	      }
	
	      scan.close();
	}

}
