package maven10.day10.maven;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("Newfile.xml");
    	MessagePass pass = (MessagePass)context.getBean("msgpass");
    	pass.displaymsg();
    }
    }

