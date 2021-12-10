import java.util.*;

public class sizemethod {
	
	  

	    public static void main(String[] args)
	    {
	  
	        
	        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	  
	        
	        hash_map.put(10, "good");
	        hash_map.put(15, "4");
	        hash_map.put(20, "bad");
	        hash_map.put(25, "day");
	        hash_map.put(30, "winter");
	  
	        System.out.println("Initial Mappings are: " + hash_map);
	        
	        
	        System.out.println("The size of the map is " + hash_map.size());
	    }
	}


