import java.util.Scanner; 
	 
public class calciright {
	
	 
	 
	

	    public static void main(String ars[])
	    {
	        char choice;
	        Scanner scan=new Scanner(System.in);  
	        do {
	        System.out.print("Enter first no"); 
	        int n1= scan.nextInt(); 
	        System.out.print("Enter second no");
	        int n2= scan.nextInt(); 
	        System.out.print("Select your operation :\n1.Addition\n2.Subtracation\n3.Multiplication\n4.Division");
	        int op=scan.nextInt();
	        if(op==1)
	        {
	            System.out.print("Addition :"+(n1+n2));
	        }
	        else if(op==2)
	        {
	            System.out.print("Subtraction :"+(n1-n2));
	        }
	        else if(op==3)
	        {
	            System.out.print("Mul :"+(n1*n2));
	        }
	        else if(op==4)
	        {
	            System.out.print("Division :"+(n1/n2));
	        }else
	        {
	 
	            System.out.print("Enter valid choice(1,2,3,4)");
	        }
	        System.out.print("Do you want to continue?(y/n)");
	        choice=scan.next().charAt(0);
	        }
	        while(choice=='y' || choice=='Y');
	        System.out.print("Thankyou!!!");
	}
	}



