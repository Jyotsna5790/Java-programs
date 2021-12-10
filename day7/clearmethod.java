import java.util.Map;
import java.util.HashMap;
public class clearmethod {
	 public static void main(String[] args)
	    {
	  
	        
	        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	  
	       
	        hash_map.put(10, "book");
	        hash_map.put(15, "4");
	        hash_map.put(20, "pencil");
	        hash_map.put(25, "pen");
	        hash_map.put(30, "copy");
	  
	        
	        System.out.println("Initial Mappings are: " + hash_map);
	        
	        
	        hash_map.clear();
	  
	        
	        System.out.println("Finally the maps look like this: " + hash_map);
	    }
	}


