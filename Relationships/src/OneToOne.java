import entity.Employee;
import lk.ijse.dep.hibernate.util.entity.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class OneToOne {

    public static void main(String[] args) {

        try(SessionFactory sf = HibernateUtil.getSessionFactory(); Session session = sf.openSession()){

            session.beginTransaction();

            session.save(new Employee("E001", "Ashan", "Gampaha"));

            session.getTransaction().commit();
        }

    }

}
