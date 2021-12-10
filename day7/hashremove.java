import java.io.*;
import java.util.*;

public class hashremove {

	    public static void main(String args[])
	    {
	        
	        Map<Integer, String> hm = new HashMap<Integer, String>();
	 
	        
	        hm.put(1, "Goo");
	        hm.put(2, "Fee");
	        hm.put(3, "Gap");
	        hm.put(4, "For");
	 
	        
	        System.out.println("Mappings of HashMap are : "+ hm);
	        
	        hm.remove(4);
	 
	        
	        System.out.println("Mappings after removal are : "
	                           + hm);
	    }
	}


