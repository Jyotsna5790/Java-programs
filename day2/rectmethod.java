import java.util.Scanner;


public class rectmethod {
	
		public static void main(String args[]){ 
		   Scanner s= new Scanner(System.in);
		      System.out.println("Enter the lenth and breath:");
		      double l= s.nextDouble(); 
		      double b= s.nextDouble(); 
		      double  a= rect(l,b);
		      System.out.println("Area of rectangle is: " + a);      
		   }
		   static double rect(double l, double b)
		    {
			return (l*b);
		    }
		
		      
	   }

	   


