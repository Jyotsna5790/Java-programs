import java.io.*;
class Square {


	void Area(double side)
    {
        System.out.println("Area of the Square: "
                           + side * side);
    }
}
	
public class squaremethod {
	public static void main(String args[])
	{
		  
        // Creating object of square class
        Square obj = new Square();
  
        // Calling function
        obj.Area(10);
        obj.Area(3.2);
    }
}

