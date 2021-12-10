import java.util.HashMap;


public class bookdet {
	public static void main(String[] args){
		HashMap<String,Books1> map=new HashMap<String, Books1>();
		Books1 b1=new Books1("Java" ,1, 600);
		Books1 b2=new Books1("php" ,2, 700);
		Books1 b3=new Books1("ML" ,3, 800);
		
		map.put("book1",b1);
		map.put("book2",b2);
		map.put("book3",b3);
		
		for(Map.Entry<String.Books1> me:map.entrySet())
		{
			System.out.println(me.getKey)+ " : "+me.getValue().name+" "+me.getValue().id+" "+me.getValue().price;
			
		}
		
	}

}
class Books1{
	String name;
	int id, price;
	public Books1(String name, int id, int price){
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		}
	public String toString()
	{
		return " Name : " +name+ "id :" +id+ "price :" +price;  
	}
}
