package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.entity.Order;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.collection.internal.PersistentBag;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class OneToMany {
    public static void main(String[] args) {
        Customer c001;
        try(SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession()){
            session.beginTransaction();

//            Customer alisa = new Customer("C001", "Alisa", "Pinwatte");
//            Order od001 = new Order("OD001", Date.valueOf("2019-10-01"), alisa);
//            Order od002 = new Order("OD002", Date.valueOf("2019-10-02"), alisa);
//
//            List<Order> alOrders = new ArrayList<>();
//            alOrders.add(od001);
//            alOrders.add(od002);
////            alisa.setOrders(alOrders);
////            alisa.getOrders().add(od001);
////            alisa.getOrders().add(od002);
////
//            Customer leel = new Customer("C002", "Leel", "Mathugama");
//            Order od003 = new Order("OD003", Date.valueOf("2019-10-02"), leel);
//            leel.getOrders().add(od003);
//////
////////            System.out.println(alisa.getOrders().size());
//////e
//            session.persist(alisa);
//            session.save(od001);
//            session.save(od002);
////
//            session.persist(leel);
//            session.save(od003);

//            Customer alisa = session.get(Customer.class, "C001");
//            alisa.getOrders().forEach(System.out::println);
//            Order od004 = new Order("OD004", Date.valueOf("2019-10-03"), alisa);
//            session.save(od004);
//            System.out.println("===================");
//            alisa.getOrders().forEach(System.out::println);

//            Order od001 = session.get(Order.class, "OD001");
//            System.out.println("=================================");
//            System.out.println(od001.getCustomer());
            //Order od002 = session.get(Order.class, "OD002");
//            Customer alisa = session.get(Customer.class, "C001");
//
//            System.out.println("=========================");
//            System.out.println(alisa.getOrders().get(0));

            //Customer leel = session.get(Customer.class, "C002");

//            alisa.addOrder(od002);
//            od002.setCustomer(leel);

//            alisa.getOrders().get(0).setCustomer(leel);

//            Order od001 = session.get(Order.class, "OD003");
//            session.remove(od001);

//            Customer alisa = session.get(Customer.class, "C001");
//            alisa.setOrders(new ArrayList<>());
//            System.out.println(alisa.getOrders().get(0).hashCode());
//            session.detach(alisa);
//            Customer clonedAlisa = (Customer) session.merge(alisa);
//            System.out.println(clonedAlisa.getOrders().get(0).hashCode());

            //System.out.println(session.contains(alisa.getOrders().get(0)));

            //======================================================


            c001 = session.get(Customer.class, "C001");
            c001.getOrders().add(new Order("0D004", Date.valueOf("2019-01-01"),session.load(Customer.class,"C001")));
            //System.out.println("---------------");
            //session.detach(c001);

//            System.out.println(orders);

            //System.out.println(c001.getOrders().size());
            //System.out.println("---------------");
            //c001.getOrders().add(new Order("OD005", Date.valueOf("2019-11-01"),session.load(Customer.class,"C001")));
            //System.out.println(c001.getOrders().getClass());


            session.getTransaction().commit();
        }

    }
}
