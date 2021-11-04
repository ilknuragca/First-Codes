package day01try;

public class Concatenation {

	public static void main(String[] args) {

	/*	String str1="Learn" +"Java" ;
		System.out.println(str1);
		
		String str2="2"+"5";
		System.out.println(str2);
		
		String str3="Learn" + " " + "Java";
		System.out.println(str3);
		
		String str4= 2 + 3+ "5";
		System.out.println(str4);  //55
*/
	    int numA=2, numB=3;
		String str1="Study", str2="Hard";
		String s1="Study" + " "+ "Hard"; 		System.out.println(s1);
		String s2= 2+3+" " + str1; System.out.println(s2);
		String s3=str2+"2"+"3";  System.out.println(s3);
		String s4=str2+(numB-numA);  System.out.println(s4);
		String s5=(numA*numB)+""+(numB-numA)+str1+(numA-numB); System.out.println(s5);
	}

}
