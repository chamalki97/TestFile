package lk.ijse.dep.hibernate.util;

import lk.ijse.dep.hibernate.util.entity.Customer;
import lk.ijse.dep.hibernate.util.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class UpdateDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        Customer Chamalki = session.get(Customer.class, "C001");
//
//        session.evict(Chamalki);
//
//        session.update(Chamalki);
//
//        Chamalki.setName("Madushika");

        Customer Chamalki = new Customer("C002", "Chamalki", "Malinda", new Date());

        session.update(Chamalki);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
