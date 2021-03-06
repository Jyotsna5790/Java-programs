
public class triangle {
	
	    // Function to demonstrate printing pattern
	    public static void printStars(int n)
	    {
	        // declare int variable, here k is to include number of space
	        int i, j, k=2*n-2;
	 
	        // outer loop to handle number of rows     
	        for(i=0; i<n; i++)
	        {
	 
	            // inner loop to handle number spaces
	            for(j=0; j<k; j++)
	            {
	                // printing spaces first
	                System.out.print(" ");
	            }
	             
	            // decrementing k after each loop
	            k = k - 2;
	             
	            //  inner loop to handle number of columns
	            //  values changing acc. to outer loop
	            for(j=0; j<=i; j++)
	            {
	                // printing stars
	                System.out.print("* ");
	            }
	             
	            // print new line for next row
	            System.out.println();
	        }
	    }
	 
	    // Main Function
	    public static void main(String args[])
	    {
	        int n = 5;
	     //Call printStars with to print pyramid with 5 rows
	        printStars(n);
	    }
	}

