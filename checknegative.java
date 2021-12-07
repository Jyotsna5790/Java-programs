import java.util.*;  

public class checknegative {
	public static void main(String[] args)   
	{  
	
	System.out.println(positiveOrNegative(42));  
	  
	System.out.println(positiveOrNegative(0));   
	  
	System.out.println(positiveOrNegative(-190));   
	}  
	
	public static String positiveOrNegative(int n)   
	{  
	  
	ArrayList<String> result = new ArrayList<String>();  
	 
	result.add("Zero");  
	
	for(int i=0; i<n; i++)   
	{  
	 
	result.add("Positive");  
	}  
	String result1="";  
	
	try   
	{  
	 
	result1 = result.get(n);  
	}   
	catch (Exception e)   
	{  
	  
	result1="Negative";  
	}  
	
	return result1;  
	}  
	}  



