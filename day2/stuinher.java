import java.util.Scanner;

class stuinher {
	
	

		
		  int roll_no;

		  String name, cl;

		 //creating a function to take student details  

		  void input() {

		Scanner sc = new Scanner(System.in);  

		 

		System.out.print("Enter Roll Number: ");

		roll_no = sc.nextInt();  //=> 22\n == buffer

		 

		sc.nextLine(); // => \n

		 

		System.out.print("Enter Name: ");

		name = sc.nextLine();

		 

		System.out.print("Enter class: ");

		cl = sc.nextLine();

		  }

		}

		class Student extends stuinher {

		  //method to display student details 

		  void display() {

		System.out.println("/******* Student details printed ********/");

		System.out.println("Roll Number is: "+ roll_no);

		System.out.println("Your name is: "+ name);

		System.out.println("Your class is: "+cl);

		  }

		  public static void main(String args[]) {

		Student obj = new Student();

		obj.input();

		obj.display();

		  }

		}





