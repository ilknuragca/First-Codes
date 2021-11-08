package day01try;

import java.util.Scanner;

public class Scanner01 {
	
    public static void main(String[]args) {
    	
	Scanner s1=new Scanner(System.in);
	System.out.println("enter an integer value ");
	int num1=s1.nextInt();
	System.out.println(num1);
	
	Scanner s2=new Scanner(System.in);
	System.out.println("enter an boolean value ");
	boolean b1=s2.nextBoolean();
	System.out.println(b1);
 }
}
