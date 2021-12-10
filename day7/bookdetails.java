import java.util.HashMap;


public class bookdetails {
	private Integer id;
    private String name;
    
    public bookdetails(Integer id, String name){
        this.id = id;
        this.name = name;
    }
    
    
    public String toString(){
        return "[" + this.id + ", " + this.name + "]";
    }
 
}
 
public class PrintHashMapExample {
 
    public static void main(String[] args) {
        
        HashMap<Integer,bookdetails > hMapNumbers = new HashMap<Integer, bookdetails>();
        hMapNumbers.put(1, new bookdetails(1, "Java book"));
        hMapNumbers.put(2, new bookdetails(2, "PHP book"));
        
        System.out.println( hMapNumbers );
        
    }

}
