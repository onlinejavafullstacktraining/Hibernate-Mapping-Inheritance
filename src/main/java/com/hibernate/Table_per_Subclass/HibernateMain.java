package com.hibernate.Table_per_Subclass;

import com.hibernate.Table_per_concrete.CreditCardType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class HibernateMain {
    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.addResource("BillingDetails.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        CreditCard card=new CreditCard();
        card.setExpMonth("09");
        card.setExpYear("2015");
        card.setType(CreditCardType.AMERICAN_EXPRESS.name());
        card.setCreatedDate(new Date());
        card.setNumber("254785");
        session.save(card);
        tx.commit();
        session.close();
    }
}
