package day01try;

import java.util.Scanner;

public class AskUser2 {

	public static void main(String[] args) {
		
		Scanner ask=new Scanner(System.in);
		System.out.println("Please full name ");
		String fullName=ask.nextLine();
		System.out.println("Please adress ");
		String adress=ask.nextLine();
		
		System.out.println("your name is: " + fullName);
		System.out.println("your adress is: " + adress);
	}

}
