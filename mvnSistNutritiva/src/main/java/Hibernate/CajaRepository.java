package Hibernate;

import Entidad.ClienteEntidad;
import Entidad.MovimientoEntidad;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CajaRepository implements Repository<MovimientoEntidad>{
    @Override
    public void save(MovimientoEntidad movimientoEntidad) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(movimientoEntidad);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public List<MovimientoEntidad> findAll() {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<MovimientoEntidad> cq = cb.createQuery(MovimientoEntidad.class);
            Root<MovimientoEntidad> rootEntry = cq.from(MovimientoEntidad.class);
            CriteriaQuery<MovimientoEntidad> all = cq.select(rootEntry);
            TypedQuery<MovimientoEntidad> allQuery = sesion.createQuery(all);
            ArrayList<MovimientoEntidad> movimientos = (ArrayList<MovimientoEntidad>) allQuery.getResultList();
            return movimientos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public MovimientoEntidad findbyID(int id) {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<MovimientoEntidad> cq = cb.createQuery(MovimientoEntidad.class);
            Root<MovimientoEntidad> rootEntry = cq.from(MovimientoEntidad.class);
            CriteriaQuery<MovimientoEntidad> all = cq.select(rootEntry);
            Predicate identificacion = cb.equal(rootEntry.get("id"), id);
            cq.where(identificacion);
            TypedQuery<MovimientoEntidad> allQuery = sesion.createQuery(all);
            ArrayList<MovimientoEntidad> movimientos = (ArrayList<MovimientoEntidad>) allQuery.getResultList();
            return movimientos.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public void update(MovimientoEntidad movimientoEntidad) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.merge(movimientoEntidad);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            HibernateUtil.closeSession();
        }
    }
}
