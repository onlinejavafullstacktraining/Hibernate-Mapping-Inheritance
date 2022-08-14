package com.hibernate.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Set;

public class HibernateManyToManyMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addResource("category.hbm.xml");
        configuration.addResource("item.hbm.xml");
        configuration.addResource("Bid.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Item item=new Item();
        Category category=new Category();
        Bid bid=new Bid();
        bid.setBidDescription("Bid- Description");
        item.setDescription("many to many item description");
        item.setName("many to many ");
        item.addCategory(category);
        category.setName("Many to Many");
        category.setItems(Set.of(item));
        item.setBidSet(Set.of(bid));
        bid.setItem(item);
        session.save(category);
        tx.commit();
        session.close();
    }
}
