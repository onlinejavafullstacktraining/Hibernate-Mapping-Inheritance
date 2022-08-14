package com.hibernate.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateOneToOneMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addResource("user.hbm.xml");
        configuration.addResource("address.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Address address=new Address();
        address.setCity("Hi-tech city");
        address.setStreet("Ameerpet");
        address.setZipcode("50001");
        User user=new User();
        user.setUserName("One-to-One");
        user.setAddress(address);
        address.setUser(user);
        session.save(user);
        tx.commit();
        session.close();
    }
}
