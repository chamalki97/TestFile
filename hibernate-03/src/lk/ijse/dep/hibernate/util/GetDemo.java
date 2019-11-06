package lk.ijse.dep.hibernate.util;

import lk.ijse.dep.hibernate.util.entity.Customer;
import lk.ijse.dep.hibernate.util.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GetDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Customer Ashan = session.get(Customer.class, "C001");

        System.out.println(Ashan);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
