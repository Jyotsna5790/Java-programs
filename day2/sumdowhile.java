
public class sumdowhile {
	public static void main(String[] args) 
	{
		int number=100, i = 2, evenSum = 0;
		
		do
		{
			evenSum = evenSum + i; 
			i = i + 2;
		}while(i <= number);
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
	}
}


