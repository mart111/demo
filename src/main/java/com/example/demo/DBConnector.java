package com.example.demo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class DBConnector {

    private Session session;

    private static Session getSession0() {

        Configuration cfg = new Configuration().configure();
        ServiceRegistryBuilder sb = new ServiceRegistryBuilder().applySettings(cfg.getProperties());
        return cfg.buildSessionFactory(sb.buildServiceRegistry()).openSession();
    }

    public void add(User user) {

        session = getSession0();
        try {

            session.beginTransaction();

            session.save(user);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Session getSession() {
        return session;
    }
}
