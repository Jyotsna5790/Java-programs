import java.util.Scanner;


	public class trinumber{
		public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	         
	        //Ask for number of rows    
	        System.out.println("How many rows you want in this pattern?");        
	        int rows = sc.nextInt();       // save rows count in this variable
	        
	        for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 1; j <= i; j++)
	            {
	            	//print i, 
	            	//as i =1 in first outer loop, so it will print 1
	            	//i=2 in second outer loop, so it will print 22
	            	//i=3 in third outer loop, so it will print 333 
	                System.out.print(i);
	            }
	             //print new line
	            System.out.println();
	        }
	         
	        //Close the resources
	         
	        sc.close();
	    }
	}



