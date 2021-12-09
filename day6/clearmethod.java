import java.awt.List;
import java.util.ArrayList;


public class clearmethod {
	public static void main(String[] args)
    {
  
	// create an empty list with an initial capacity
    ArrayList<String> list = new ArrayList<String>(5);

    // use add() method to initially
    // add elements in the list
    list.add("day");
    list.add("six");
    list.add("java");

    // Remove all elements from the List
    list.clear();

    // print the List
    System.out.println(list);
}
}

