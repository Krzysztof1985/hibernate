package pl.selfimproveit.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pl.selfimproveit.model.User;

public class Launcher {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		for (int i = 0; i < 100; i++) {
			User user = new User();

			user.setFirstName("Andy" + i);
			user.setLastName("Kowalsky" + i);
			session.save(user);
		}
		session.getTransaction().commit();
	}
}
