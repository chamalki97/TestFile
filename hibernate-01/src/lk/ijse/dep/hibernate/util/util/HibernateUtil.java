package lk.ijse.dep.hibernate.util.util;

import lk.ijse.dep.hibernate.util.entity.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        //(1)
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        //(2)

        Metadata metadata = new MetadataSources( standardRegistry )
                .addAnnotatedClass(Customer.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy( ImplicitNamingStrategyJpaCompliantImpl.INSTANCE )
                .build();

        //(3)
        return metadata.getSessionFactoryBuilder()
                .build();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
