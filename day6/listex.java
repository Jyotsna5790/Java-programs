import java.util.ArrayList;

public class listex {
	
	
	    public static void main(String aa[]){

        ArrayList<Integer> list = new ArrayList();//Object
        list.add(567);
        list.add(67890);
        list.add(14);

        for(int  x  : list)
        {
        System.out.println(x);    
        }

    }
}
