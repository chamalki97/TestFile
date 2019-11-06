package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Person;
import lk.ijse.dep.hibernate.entity.Pet;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneToOne2 {

    public static void main(String[] args) {

        try (SessionFactory sf = HibernateUtil.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

            Person leela = new Person("M001", "Leela", "Mathugama");
            Person dilini = new Person("M002", "Dilini", "Ambalangoada");

            Pet ballek = new Pet("P001", "Ballek");
            Pet poosek = new Pet("P002", "Poosek");

            session.update(leela);
            //poosek.setPerson(leela);
            //session.persist(poosek);
            ballek.setPerson(leela);
            session.persist(ballek);

            session.getTransaction().commit();
        }

    }

}
