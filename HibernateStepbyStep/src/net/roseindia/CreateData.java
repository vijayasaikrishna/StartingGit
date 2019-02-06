package net.roseindia;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.roseindia.model.*;
/**
 * @author Deepak Kumar 
 * Web: http://www.roseindia.net
 */
public class CreateData {
	public static void main(String[] args) throws Exception {

		
/*		
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Employee emp = new Employee();

		//emp.setId(1);
		emp.setEmpName("Sai");
		emp.setEmpMobileNos("7799840055");
		emp.setEmpAddress("Hyderabad - India");
			
		session.save(emp);
		
		
		
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();
*/
		
		
		
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
//		Employee emp = new Employee();


		List employees =session.createQuery("FROM Employee").list();
		Iterator i= employees.iterator();
		//org.hibernate.Transaction tr = session.beginTransaction();
		Employee emp1;
		
		
		
		//MAPPPING HBM FILE NOT THERES
		
		
		
		
		while(i.hasNext())
		{
		
	
	 emp1= (Employee)i.next();
	System.out.println(emp1.getEmpAddress()+" "+ emp1.getEmpMobileNos()+" "+emp1.getEmpName());
	
}
		
	
//	tr.commit();
	//session.close();
	//tr.commit();
//	System.out.println("Successfully inserted");
	//sessFact.close();
	
	
		
	addEmployee();
		
		
		
	//listEmployees();
	}

	
	
	public static void addEmployee() {
		

		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Employee emp = new Employee();

		//emp.setId(1);
		emp.setEmpName("Sai");
		emp.setEmpMobileNos("7799840055");
		emp.setEmpAddress("Hyderabad - India");
			
		session.save(emp);
		session.clear();
		session.close();
		
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();
	}
}