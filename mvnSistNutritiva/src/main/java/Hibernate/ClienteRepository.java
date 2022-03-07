package Hibernate;

import Entidad.ClienteEntidad;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements Repository<ClienteEntidad>{


    @Override
    public void sasve(ClienteEntidad cliente) {
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
    public List<ClienteEntidad> findAll() {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<ClienteEntidad> cq = cb.createQuery(ClienteEntidad.class);
            Root<ClienteEntidad> rootEntry = cq.from(ClienteEntidad.class);
            CriteriaQuery<ClienteEntidad> all = cq.select(rootEntry);
            TypedQuery<ClienteEntidad> allQuery = sesion.createQuery(all);
            ArrayList<ClienteEntidad> clientes = (ArrayList<ClienteEntidad>) allQuery.getResultList();
            return clientes;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public ClienteEntidad findbyID(int id) {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<ClienteEntidad> cq = cb.createQuery(ClienteEntidad.class);
            Root<ClienteEntidad> rootEntry = cq.from(ClienteEntidad.class);
            CriteriaQuery<ClienteEntidad> all = cq.select(rootEntry);

            Predicate identificacion = cb.equal(rootEntry.get("id"), id);
            cq.where(identificacion);

            TypedQuery<ClienteEntidad> allQuery = sesion.createQuery(all);
            ArrayList<ClienteEntidad> clientes = (ArrayList<ClienteEntidad>) allQuery.getResultList();
            return clientes.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public void update(ClienteEntidad cliente) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.merge(cliente);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public void delete(ClienteEntidad cliente) {

    }
}
