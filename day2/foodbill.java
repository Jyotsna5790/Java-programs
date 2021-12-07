import java.util.Scanner; 
	 
public class foodbill {
	public static void main(String ars[])
    {
        int n1,n2;
        int sum = 0;
        char ch;
        Scanner scan=new Scanner(System.in); 
        System.out.print("Welcome\n"); 
        do{
        System.out.print("Select your meal :\n1.Breakfast\n2.Lunch\n3.Dinner\n");
        n1=scan.nextInt();
        if(n1==1)
        {
        	System.out.print("Enter your breakfast chioce: \n1. coffee: 50\n2.oats: 60");
        	 n2=scan.nextInt();
        	
			if(n2==1){
        		sum+=50;
        	}
        	else if(n2==2){
        		sum+=60;
        	}
        	else{
        		System.out.println("Wrong chioce");
        		break;
        	}
        }
	 else if(n1==2){
		    System.out.print("Enter your lunch chioce: \n1. sandwitch: 80\n2.tea: 60");
			n2=scan.nextInt();
		    
			if(n2==1){
				sum+=80;
			}
			else if(n2==2){
				sum+=60;
			}
			else {
				System.out.println("wrong chioce");
				break;
			}
	 }
	 else if(n1==3){
		    System.out.print("Enter your dinner chioce: \n1. pasta: 100\n2.lemon tea: 60");
			n2=scan.nextInt();
		    
			if(n2==1){
				sum+=100;
			}
			else if(n2==2){
				sum+=60;
			}
			else {
				System.out.println("wrong chioce");
				break;
			}
			
	 }
        System.out.print("Do you want to order more?(y/n)");
        ch=scan.next().charAt(0);
        }
        while(ch=='y' || ch=='Y');
        System.out.print("Thankyou!!!");
    }
}
        
				
        	
	        
        
        	
