package day01try;

import java.util.Scanner;

public class ConvertsMileToKilometer {

	public static void main(String[] args) {
		//type 7
		
		Scanner mile=new Scanner(System.in);
		System.out.println("Please mil value ");
		double m1=mile.nextDouble();
		double km = m1*1.6;
		
		System.out.println("The " + m1 + " mile = " + km + " km");

	}

}
