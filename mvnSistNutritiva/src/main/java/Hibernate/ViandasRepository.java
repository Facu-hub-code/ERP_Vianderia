package Hibernate;

import Entidad.ClienteEntidad;
import Entidad.ViandaEntidad;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ViandasRepository implements Repository<ViandaEntidad>{

    @Override
    public void save(ViandaEntidad vianda) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(vianda);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public List<ViandaEntidad> findAll() {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<ViandaEntidad> cq = cb.createQuery(ViandaEntidad.class);
            Root<ViandaEntidad> rootEntry = cq.from(ViandaEntidad.class);
            CriteriaQuery<ViandaEntidad> all = cq.select(rootEntry);
            TypedQuery<ViandaEntidad> allQuery = sesion.createQuery(all);
            ArrayList<ViandaEntidad> viandas = (ArrayList<ViandaEntidad>) allQuery.getResultList();
            return viandas;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public ViandaEntidad findbyID(int id) {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<ViandaEntidad> cq = cb.createQuery(ViandaEntidad.class);
            Root<ViandaEntidad> rootEntry = cq.from(ViandaEntidad.class);
            CriteriaQuery<ViandaEntidad> all = cq.select(rootEntry);
            TypedQuery<ViandaEntidad> allQuery = sesion.createQuery(all);

            Predicate identificacion = cb.equal(rootEntry.get("id"), id);
            cq.where(identificacion);

            ArrayList<ViandaEntidad> viandas = (ArrayList<ViandaEntidad>) allQuery.getResultList();
            return viandas.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public void update(ViandaEntidad vianda) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.merge(vianda);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public void delete(ViandaEntidad viandaEntidad) {

    }
}
