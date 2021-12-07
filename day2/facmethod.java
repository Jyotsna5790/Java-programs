
import java.util.Scanner;//import the scanner class 
public class facmethod {
	
	
	public static void main(String args[]){ 
	Scanner scan=new Scanner(System.in);
	//create a scanner object 
	System.out.println("Enter a number for find factorial"); 
	int num=scan.nextInt();//get input from user
	factorial(num);//call the method
	}
	static void factorial(int num)//user defined method for calculate factorial
	{
	int i,f=1;
	for(i=1; i<=num; i++){
	f=f*i;//calculate the factorial using for loop
	}
	System.out.print("Factorial of the "+num+"is "+f); 
	//display the factorial
	}
	}


