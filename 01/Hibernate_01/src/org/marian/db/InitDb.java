package org.marian.db;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InitDb {

	public static void main(String[] args) {
		
//		UserDetails user = new UserDetails();
//		user.setUserName("User name " + user.getUserId() );
//		
//		Address addr1 = new Address();
//		addr1.setCity("City 1");
//		addr1.setPincode("Pin 1");
//		addr1.setState("CA");
//		addr1.setStreet("Street 1");
//		
//		Address addr2 = new Address();
//		addr2.setCity("City 2");
//		addr2.setPincode("Pin 2");
//		addr2.setState("LF");
//		addr2.setStreet("Street 2");
//		
//		user.getListOfAddresses().add(addr1);
//		user.getListOfAddresses().add(addr2);
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

//		session.beginTransaction();
//		session.save(user);
//		session.getTransaction().commit();
//		session.close();
		
		session = factory.openSession();
		UserDetails user = session.get(UserDetails.class, 1);
		session.close();
		System.out.println(user.getListOfAddresses().size());
		
		factory.close();
	}

}
