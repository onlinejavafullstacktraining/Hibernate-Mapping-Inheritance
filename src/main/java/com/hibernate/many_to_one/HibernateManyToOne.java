package com.hibernate.many_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateManyToOne {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addResource("Bid_many_to_one.hbm.xml");
        configuration.addResource("Item_Many_to_one.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Bid bid = new Bid();
        bid.setDescription("752.47");
        Item item = new Item();
        item.setItemName("Mobile phones");
        item.addBid(bid);
        bid.setItem(item);
        session.save(item);
        tx.commit();
        session.close();
    }
}
