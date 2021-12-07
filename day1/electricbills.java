
public class electricbills {
	public static void main(String[] args)
	{
		int bill=0;
		int n=111;
		if(n<=50)
	
			System.out.println("no bills");
		else if(n>51 && n<100)
		{
			bill=(n-50)*6;
			System.out.println("Rs " +bill+ " Electricity bills");
		}
		else if(n>101 && n<150)
		{
			bill=(n-100)*8+(50*6);
			System.out.println("Rs " +bill+ " Electricity bills");
		}
		else 
		{
			bill=(n-150)*9+(50*8)+(50*6);
			System.out.println("Rs " +bill+ " Electricity bills");
		}
		

      }
}
