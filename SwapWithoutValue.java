package day01try;

import java.util.Scanner;

public class SwapWithoutVariable {
	
         //Swap two number without using third variable
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter 2 integers..");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("1. number = " + num1 +" / "+ " 2. number = " + num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("1. number = " + num1 +" / "+ " 2. number = " + num2);
	}

}
