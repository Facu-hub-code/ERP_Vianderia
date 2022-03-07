package Hibernate;

import Entidad.ClienteEntidad;
import Entidad.ViandaEntidad;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static Session session;
    private static SessionFactory sf;

    public static boolean inicializarAcceso(String user, String password) {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(ClienteEntidad.class);
        configuration.addAnnotatedClass(ViandaEntidad.class);
        configuration.setProperty("hibernate.connection.username", user);
        configuration.setProperty("hibernate.connection.password", password);
        try {
            sf = configuration.buildSessionFactory();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause().printStackTrace();
            return false;
        }
    }


    public static Session getSession() {
        session = sf.openSession();
        return session;
    }

    public static void closeSession(){
        if(session != null) {
            session.close();
            session = null;
        }
    }


}
