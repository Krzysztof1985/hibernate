package pl.selfimproveit.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pl.selfimproveit.model.User;

public class Launcher {

	   public static void main(String[] args) {
		   
           SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
           Session session = sessionFactory.openSession();
           session.beginTransaction();

           List<User> users = session.createCriteria(User.class).list();
          
           for (User userValues: users) {
                   System.out.println(userValues);
           }
           session.getTransaction().commit();
           session.close();
   }
}
