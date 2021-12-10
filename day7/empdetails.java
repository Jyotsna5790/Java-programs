import java.util.HashMap;
import java.util.Scanner;

public class empdetails {
public static void main(String[] args) {

	 Scanner input = null;
	 String name;
	 int id ;
	 HashMap<String, Integer> hMap = new HashMap<String, Integer>();
	 try {
	 input=new Scanner(System.in);
	 
	 while (input.hasNext()) {
	 name = input.next();
	 id = input.nextInt();
	 hMap.put(name,id);
	 }
	 System.out.println("HashMap with Details:");
	 hMap.forEach((name,id) -> System.out.println("Name: " +name+ " id:"+ id));
	 }
	 catch (Exception e) {
	 e.printStackTrace();
	 } finally
	 {
	 if(input!=null)
	 {input.close();}
	 }

	 }

	}
	 


