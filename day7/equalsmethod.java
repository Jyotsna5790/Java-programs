import java.util.HashMap;

public class equalsmethod {
	
	 public static void main(String[] args) {

	  HashMap < String, String > hm = new HashMap < String, String > ();
	  hm.put("C", "Dennis");
	  hm.put("C++", "Bjarne");
	  hm.put("Java", "James");
	  hm.put("Python", "Guido");

	  HashMap < String, String > hm1 = new HashMap < String, String > ();

	  hm1.put("C", "Dennis ");
	  hm1.put("C++", "Bjarne ");
	  hm1.put("Java", "James ");
	  hm1.put("Python", "Guido");

	  boolean a = hm.equals(hm1);
	  System.out.println(a);

	  HashMap < String, Integer > hm2 = new HashMap < String, Integer > ();
	  hm2.put("Aamir", 100);
	  hm2.put("Kumar", 101);
	  hm2.put("John", 102);

	  boolean b = hm.equals(hm2);
	  System.out.println(b);
	 }
	}
	
