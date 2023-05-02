package com.yarisma.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

    private static final SessionFactory FACTORY;

    static{
        try{
            /**
             * default olarak src/main/resources/hibernate.cfg.xml             *
             */
            FACTORY = new Configuration().configure().buildSessionFactory();
        } catch (Exception ex){
            throw ex;
        }
    }

    public static SessionFactory getFACTORY(){
        return FACTORY;
    }
}
