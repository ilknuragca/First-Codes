package day01try;

import java.util.Scanner;

public class ConvertsHours {

	public static void main(String[] args) {
		
		Scanner hours=new Scanner(System.in);
		System.out.println("Please hours value ");
		long h1=hours.nextLong();
		long second= h1*60*60;
		System.out.println(h1+ " hours is " + second + " second");

	}

}
