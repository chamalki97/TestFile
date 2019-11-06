package lk.ijse.dep.hibernate.util;

import lk.ijse.dep.hibernate.util.entity.Customer;
import lk.ijse.dep.hibernate.util.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class PersistDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Customer customer = new Customer("C002", "Ashan", "Gampaha", new Date());

        session.persist(customer);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}

