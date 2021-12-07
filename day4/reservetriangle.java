
public class reservetriangle {
	public static void printNums(int n)
	{
		// initializing starting number
		int i, star, rows=n, space;
		
		// outer loop to handle number of rows
		// n in this case
	     for(i = rows;i >= 1; i--) {
            // Printing spaces 
            for(space = 0; space <= rows-i; space++) {
                System.out.print(" ");
            }
            // Printing stars
            star = 0;
            while(star != (2*i - 1)) {
        
                System.out.print("*");
                star++;
            }
            System.out.print("\n");
        }
	}
	
	// Driver Function
	public static void main(String args[])
	{
		int n = 4;
		printNums(n);
	}
}


