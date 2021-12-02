package day05nestedifternary;

public class Ternary01 {
	
	public static void main(String[] args) {
		//If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
		int num =12; //0 or -3 try
		//solve by using if-else
		
		if(num>0) {System.out.println("The integer is positive");} else {System.out.println("The integer is not positive");}
				 
	//solve by using ternary	
   	    String result= num>0 ?	 "The integer is positive" : "The integer is not positive";
		System.out.println(result);	
		
		// write a program to print the minimum of 2 integers on the console, use ternary
		int n1 = 12; //n1=23 n2=23 so is false ... 
		int n2 =23;
		int min = n1<n2 ? n1 :n2;
		 System.out.println(min+ " is the min");
		
		 //Write a program to print absolute value of an integer entered by user. 
		 //abs(-2)=2, abs(5)=5 , abs(0)=0
		 //To make a negative number positive multiply it by -1
		 
		 int n3=0;
		 int abs= n3>=0 ? n3 : n3*(-1); //-1*n3 
		 System.out.println(abs+" is the absolute value");
	}

}
