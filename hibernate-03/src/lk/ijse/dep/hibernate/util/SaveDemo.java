package lk.ijse.dep.hibernate.util;

import lk.ijse.dep.hibernate.util.entity.Customer;
import lk.ijse.dep.hibernate.util.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.Date;

public class SaveDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Customer customer = new Customer("C001", "Chamalki", "Dompe", new Date());

        Serializable id = session.save(customer);

        System.out.println(id);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
