
public class sumwhile {
	public static void main(String[] args) 
	{
		int number=100, i = 2, evenSum = 0;
			
		
		while(i <= number)
		{
			evenSum = evenSum + i; 
			i = i + 2;
		}
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
	}
}


