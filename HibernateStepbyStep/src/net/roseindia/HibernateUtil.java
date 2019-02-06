package net.roseindia;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * @author Deepak Kumar 
 * Web: http://www.roseindia.net
 */
public class HibernateUtil {
	//private static final SessionFactory sessionFactory;
	 private static SessionFactory factory; 
	private static ServiceRegistry serviceRegistry;
	
	static {

		
		try {
	        factory = new Configuration().configure().buildSessionFactory();
	     } catch (Throwable ex) { 
	        System.err.println("Failed to create sessionFactory object." + ex);
	        throw new ExceptionInInitializerError(ex); 
	     }
		
		
		
		/*try {

			Configuration configuration = new Configuration();
			configuration.configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(
					configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		} catch (Throwable th) {

			System.err.println("Enitial SessionFactory creation failed" + th);

			throw new ExceptionInInitializerError(th);

		}
*/
	}

	public static SessionFactory getSessionFactory() {

		return factory;

	}
}
