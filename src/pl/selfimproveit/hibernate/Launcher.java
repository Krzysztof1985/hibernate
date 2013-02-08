package pl.selfimproveit.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pl.selfimproveit.model.User;

public class Launcher {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		User user1 = new User();
		user1.setFirstName("Andy");
		
		user1.setLastName("Kowalsky");
		
		session.beginTransaction();
		session.save(user1);
		session.getTransaction().commit();
		session.close();
	}
}
