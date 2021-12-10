import java.util.*;  
class replacemethod {
	
	
	 public static void main(String args[]){  
	   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	      hm.put(100,"Amul");    
	      hm.put(101,"Vicky");    
	      hm.put(102,"Raj");   
	      System.out.println("Initial list of elements:");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:");  
	     hm.replace(102, "Gaurav");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:");  
	     hm.replace(101, "Vicky", "Raj");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }   
	     System.out.println("Updated list of elements:");  
	     hm.replaceAll((k,v) -> "Amul");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	 }  
	}  

