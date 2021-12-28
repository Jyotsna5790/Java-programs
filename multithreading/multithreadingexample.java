package multithreadingex;

public class multithreadingexample extends Employee implements Runnable  {
	
	public static void main(String []args){
		multithreadingexample  d1=new multithreadingexample (); //Thread 1
	       Thread t1=new Thread((Runnable) d1);
	         t1.start();
	         t1.setName("t1");

	    }

	    public void run()
	    {

	        for(int i=1;i<=10;i++)
	        {    
	            try{
	            Thread.sleep(2000); //2000 miliseconds= 2 sec

	            }
	            catch(Exception e)
	            {

	            }
	              String name = null;
				System.out.println(name+" : "+i);

	    }


	}}


