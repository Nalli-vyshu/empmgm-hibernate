package com.empmgm;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        employee e1=new employee();
        
        
        e1.setEmpId(24);
        e1.setEmpName("puppy");
        e1.setEmpLocation("ppl");
        e1.setEmpProject("java project");
        
       Configuration con=new Configuration().configure().addAnnotatedClass(employee.class);
       SessionFactory sf=con.buildSessionFactory();
       
       Session ses=sf.openSession();
       
       Transaction tx=ses.beginTransaction();
        ses.save(e1);
        tx.commit();
        
        System.out.println(e1);
        
    }
}
