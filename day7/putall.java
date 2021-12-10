import java.util.*;
public class putall {
	public static void main(String[] args) {
	      
	    
	    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	  
	    
	    hash_map.put(10, "Jyo");
	    hash_map.put(35, "4");
	    hash_map.put(50, "Joo");
	    hash_map.put(65, "mini");
	    hash_map.put(70, "jochi");
	  
	    
	    System.out.println("Initial Mappings are: " + hash_map);
	  
	    
	    HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
	    new_hash_map.putAll(hash_map);
	 
	    System.out.println("The new map looks like this: " + new_hash_map);
	}
	}


