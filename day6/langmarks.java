import java.util.ArrayList;


public class langmarks {
	public static void main(String aa[]) 
    {
//    Object //parent of all the classes



        ArrayList<emp> list=new ArrayList<emp>();//Object

        emp e1=new emp("java", "8");
        emp e2=new emp("php", "9");
        list.add(e1);
        list.add(e2);
        list.add(new emp("html","8"));

        for(emp  x  : list)
        {
        System.out.println(x);    
        }

    }
}
 
class emp
{
    String lang;
	int marks;
 
    public emp(String lang, int  marks) {
        super();
        this.lang = lang;
        this.marks = marks;
    }
 
    public emp(String lang2, String string) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
        return lang;
    }
 
    public void setName(String lang) {
        this.lang = lang;
    }
 
    public int getId() {
        return marks;
    }
 
    public void setId(int marks) {
        this.marks = marks;
    }

    public String toString()
    {
    return "Lang :"+lang+"\nMarks  :"+marks;

    }
    }





