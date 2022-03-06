package Hibernate;

import Entidad.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ClienteRepository implements Repository<Cliente>{


    @Override
    public void sasve(Cliente cliente) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(cliente);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public List<Cliente> findAll() {
        return null;
    }

    @Override
    public Cliente findbyID(int id) {
        return null;
    }

    @Override
    public void update(Cliente cliente) {

    }

    @Override
    public void delete(Cliente cliente) {

    }
}
