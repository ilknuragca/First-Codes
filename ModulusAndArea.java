package day01try;

import java.util.Scanner;

public class ModulusAndArea  {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter 2 integers.. Must be 1. number greater than 2. number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		
		if(num1>num2) {
			int width=num1%num2;
			int length= num1+num2;
			System.out.println("the area of rectangle " + width*length);
			System.out.println("the area of rectangle " + 2*(width+length));
			
		}else {
			System.out.println("sorry, 1.number smaller than 2. number");
		}

	}

}
