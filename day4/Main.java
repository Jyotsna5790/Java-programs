interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Horse implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The horse says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}
 class Main {public static void main(String[] args) {
	    Horse myhor = new Horse();  // Create a Pig object
	    myhor.animalSound();
	    myhor.sleep();
	  }

}
