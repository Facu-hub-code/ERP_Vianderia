package Repository;

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
    public boolean save(ViandaEntidad vianda) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(vianda);
            transaction.commit();
            return true;
        }catch (Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
            return false;
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

            Predicate anulado = cb.equal(rootEntry.get("anulado"), false);
            cq.where(anulado);

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

            Predicate anulada = cb.equal(rootEntry.get("anulado"), false);
            Predicate identificacion = cb.equal(rootEntry.get("id"), id);
            Predicate predicate = cb.and(anulada, identificacion);
            cq.where(predicate);

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
    public boolean update(ViandaEntidad vianda) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.merge(vianda);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return false;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public boolean delete(ViandaEntidad viandaEntidad){
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.delete(viandaEntidad);
            transaction.commit();
            return true;
        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return false;
        }finally {
            HibernateUtil.closeSession();
        }

    }
}
