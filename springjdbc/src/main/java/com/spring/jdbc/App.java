package com.spring.jdbc;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Progam started" );
        
        // Spring jdbc--> JdbcTemplate
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml"); 
        
       JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class); 
    
    //insert query....
       
       String query="insert into student(studentId,name,city)values(?,?,?)";
       
       //fire the query
       int result = template.update(query,789,"Dilip kumar","Delhi");
       System.out.println("number records inserted "+ result);
    }
}