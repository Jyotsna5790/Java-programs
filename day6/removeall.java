import java.util.*;
public class removeall {
	 public static void main(String[] args)
	    {
	  
	        // Initializing a list of type Linkedlist
	        List<String> l = new LinkedList<>();
	        l.add("10");
	        l.add("30");
	        l.add("50");
	        l.add("70");
	        l.add("90");
	        System.out.println(l);
	  
	        ArrayList<String> arr = new ArrayList<>();
	        arr.add("30");
	        arr.add("50");
	        l.removeAll(arr);
	  
	        System.out.println(l);
	    }

}
