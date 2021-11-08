package day01try;

public class Varibles01 {
  public static void main(String[] args) {
	  //boolean-char-byte-short-int-long-float-double  *smaller==>larger
	  
	  //Auto widening casting
	 byte num1=12;
	 short num2=num1;
	 System.out.println(num2);
	 
	 short num3=123;
	 int num4= num3;
	 System.out.println(num4);
	 
	  int num5=45698;
	  double num6=num5;
	  System.out.println(num5);
	  
	  float a9=3.56f;
	  double d1= a9;
	  System.out.println(d1);
			  
	 //explicit Narrowing Casting **larger==>smaller
	  short a1=15;
	  byte a2= (byte)a1;
	  System.out.println(a2);
	  
	  int a4=90;
	  short a5=(short)a4;
	  System.out.println(a5);
	  
	  double a6=456987;
	  int a7= (int)a6;
	  System.out.println(a7);
	  
	  short s1=255;
	  byte s2=(byte)s1;
	  System.out.println(s2);    //byte -127 o 128
	  
	  ///////////
	  int n1=5/2;
	  System.out.println(n1);
	  
	  float n2=5f/2f;
	  System.out.println(n2);
	  
	  double n3=5d/2d;
	  System.out.println(n3);
			  
	  int w1=5/3;
	  System.out.println(w1);
	  
	  float w2=5f/3f;
	  System.out.println(w2);
	  
	  double w3=5d/3d;
	  System.out.println(w3);
	  
  }
}
