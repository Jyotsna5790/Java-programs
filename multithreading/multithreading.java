package multithreadingex;

public class multithreading implements Runnable {
	public static void main(String []args){
		multithreading d1=new multithreading(); //Thread 1
	       Thread t1=new Thread(d1);
	         t1.start();
	         t1.setName("t1");

	    }

	    public void run()
	    {

	        for(int i=1;i<=10;i++)
	        {    
	            try{
	            Thread.sleep(2000);//2000 miliseconds= 2 sec

	            }
	            catch(Exception e)
	            {

	            }
	              System.out.println(i);

	    }


	}}

	
	 
		