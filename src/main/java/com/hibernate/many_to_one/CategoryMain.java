package com.hibernate.many_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CategoryMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addResource("Category.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Category parent=new Category();
        parent.setCategoryName("Electronics");

        Category CellPhones=new Category();
        CellPhones.setCategoryName("Cell Phones");
        parent.addChildCategory(CellPhones);

        Category Computer=new Category();
        Computer.setCategoryName("Computer");
        parent.addChildCategory(Computer);

        session.save(parent);
        tx.commit();
        session.close();



    }
}
