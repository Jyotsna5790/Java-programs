interface Polygon {
  void getarea();

  // default method 
   void getSides(); 
}

// implements the interface
class Rectangle implements Polygon {
  public void getarea() {
    int length = 6;
    int breadth = 5;
    int area = length * breadth;
    System.out.println("The area of the rectangle is " + area);
  }

  // overrides the getSides()
  public void getSides() {
    System.out.println("I have 4 sides.");
  }


// implements the interface
class Square implements Polygon {
  public void getArea() {
    int length = 5;
    int area = length * length;
    System.out.println("The area of the square is " + area);
  }

public void getarea() {
	// TODO Auto-generated method stub
	
}

public void getSides() {
	// TODO Auto-generated method stub
	
}
}

class area {
  public void main(String[] args) {

    // create an object of Rectangle
    Rectangle r1 = new Rectangle();
    r1.getarea();
    r1.getSides();

    // create an object of Square
    Square s1 = new Square();
    s1.getArea();
    s1.getSides();
  }
}
}
