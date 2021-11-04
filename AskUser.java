package day01try;

import java.util.Scanner;

public class AskUser {

	public static void main(String[]args) {
		
		Scanner ask=new Scanner(System.in);
		System.out.println("Please first name ");
		String firstName=ask.nextLine();
		System.out.println("Please middle name ");
		String middleName=ask.nextLine();
		System.out.println("Please last name ");
		String lastName=ask.nextLine();
		
		System.out.println(firstName + " "+  middleName + " " + lastName);
	}
}
