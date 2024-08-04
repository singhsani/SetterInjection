package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dependency injection is a disign pattern
 * that remove dependency from code so that easy to manage
 * and test the application
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student student=context.getBean("stu",Student.class);
        System.out.println(student);
    }
}
