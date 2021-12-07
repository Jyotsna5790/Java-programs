
public class factwhile {
public static void main(String[] args) {  
        
        //declaring and intializing variables   
        int fact = 1;  
        int i = 1; 
        int num=8;
  
     //counting the factorial using while loop  
        do{  
            fact = fact * i;   
            i++; //increment i by 1   
        }    while( i <= num );  
  
        //printing the result  
        System.out.println("\nFactorial of " + num + " is: " + fact);  
    }  
}  



