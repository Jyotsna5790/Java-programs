import java.util.ArrayList;
import java.util.Scanner;
 
public class demo {
	public static void main(String aa[]) 
    {

        ArrayList<String> list=new ArrayList();//Object
        list.add("hello");
        list.add("people");
        list.add("hi");

        for(String x  : list)
        {
        System.out.println(x);    
        }

    }
}
