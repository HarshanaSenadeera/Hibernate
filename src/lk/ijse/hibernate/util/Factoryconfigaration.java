package lk.ijse.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factoryconfigaration {

    private static Factoryconfigaration factoryconfigaration;

    private SessionFactory sessionFactory;

    private Factoryconfigaration(){

        Configuration configuration = new Configuration();
        sessionFactory = configuration.buildSessionFactory();
    }

    public static Factoryconfigaration getInstance(){
        return (factoryconfigaration==null) ? factoryconfigaration=new Factoryconfigaration():
                factoryconfigaration;
    }

    public Session getsession(){
        return sessionFactory.openSession();
    }

}
