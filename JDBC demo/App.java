package JdbcDemoSpring.jdbcdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	EmployeeOperations op=(EmployeeOperations)context.getBean("operationdemo");

    	Employee e1=new Employee();
    	e1.setEmail("jyo");
    	e1.setId("6");
    	e1.setName("jyotsna");
    	e1.setSalary("5790");

    	int result= op.insert(e1);
    	System.out.print(result);


        
    }
}
