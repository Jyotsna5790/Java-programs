import java.util.*;
public class isempty {
	 public static void main(String[] args)
	    {
	  
	        // Creating an empty HashMap
	        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
	  
	        // Mapping int values to string keys
	        hash_map.put("nbhsd", 10);
	        hash_map.put("sbcj", 15);
	        hash_map.put("sjxh", 20);
	        hash_map.put("sbhj", 25);
	        hash_map.put("cmsnk", 30);
	  
	        // Displaying the HashMap
	        System.out.println("The Mappings are: " + hash_map);
	  
	        // Checking for the emptiness of Map
	        System.out.println("Is the map empty? " + hash_map.isEmpty());
	    }

}
