class Stu
{
    private final  String name;

    Stu()
    {
        name = "Unknown";
    }

    Stu(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
}

 




public class student {
	public static void main(String[] args) {
        Stu s1 = new Stu();
        Stu s2 = new Stu("Raj");

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Name: " + s2.getName());
    }
}
	

