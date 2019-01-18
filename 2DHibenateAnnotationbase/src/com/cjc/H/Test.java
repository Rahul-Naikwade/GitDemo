package com.cjc.H;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	
	public static void main(String[] args) 
	{	

System.out.println("Git HUB");

	SessionFactory sf=HibernateUtil.getSessionFactory();	
	Session session=sf.openSession();
	//Student s=new Student();
	Student s=session.load(Student.class,10);//get method get the data....in availble in table..we have need or not need first get datad
	System.out.println(s.getName());
	System.out.println(s.getAddr());
	
	/*s.setSid(101);
	s.setName("SAY");
	s.setAddr("Nanded");
	session.save(s);
	session.beginTransaction().commit();*/
	
	//Student s=(Student) session.load(Student.class, 1);
	//System.out.println();
	
	
	
	
	}

}
