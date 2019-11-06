package lk.ijse.dep.hibernate.util;

import lk.ijse.dep.hibernate.util.entity.Customer;
import lk.ijse.dep.hibernate.util.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class EvictDetachDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        Customer Chamalki = new Customer("C002", "Chamalki", "Gampaha", new Date());
//
//        session.save(Chamalki);
//
//        session.detach(Chamalki);

        Customer Ashan = session.get(Customer.class, "C001");

        session.evict(Ashan);

        Ashan.setAddress("Gampaha");

        System.out.println(Ashan);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
