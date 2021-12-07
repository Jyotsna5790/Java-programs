
public class factdowhile {
	public static void main(String[] args) {  
        
        //declaring and intializing variables   
        int fact = 1;  
        int i = 1; 
        int num=4;
  
     //counting the factorial using while loop  
        while( i <= num ){  
            fact = fact * i;   
            i++; //increment i by 1   
        }     
  
        //printing the result  
        System.out.println("\nFactorial of " + num + " is: " + fact);  
    }  
}  


