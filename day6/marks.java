import java.util.*;
public class marks {
	public static void main(String[] args)
	{
		ArrayList<lang1> list= new ArrayList<lang1>();
		lang1 a1=new lang1("java",8);
		lang1 a2=new lang1("php",7);
		lang1 a3=new lang1("ML",9);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		for(lang1 a:list)
		{
			System.out.println(a.lang+" "+a.marks);
			
		}
	}
	
			
		
	}
class lang1
{
	String lang;
	int marks;
	public lang1(String lang, int marks){
		super();
		this.lang = lang;
		this.marks = marks;
	}

}
