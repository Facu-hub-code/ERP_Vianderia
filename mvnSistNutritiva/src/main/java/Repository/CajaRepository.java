package Repository;

import Entidad.MovimientoEntidad;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class CajaRepository implements Repository<MovimientoEntidad>{
    @Override
    public boolean save(MovimientoEntidad movimientoEntidad) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(movimientoEntidad);
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
    public List<MovimientoEntidad> findAll() {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<MovimientoEntidad> cq = cb.createQuery(MovimientoEntidad.class);
            Root<MovimientoEntidad> rootEntry = cq.from(MovimientoEntidad.class);
            CriteriaQuery<MovimientoEntidad> all = cq.select(rootEntry);
            Predicate anulado = cb.equal(rootEntry.get("anulado"), false);
            cq.where(anulado);
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
    public boolean update(MovimientoEntidad movimientoEntidad) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.merge(movimientoEntidad);
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

    public ArrayList<MovimientoEntidad> findHoyEfectivo(boolean efectivo) {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<MovimientoEntidad> cq = cb.createQuery(MovimientoEntidad.class);
            Root<MovimientoEntidad> rootEntry = cq.from(MovimientoEntidad.class);
            CriteriaQuery<MovimientoEntidad> all = cq.select(rootEntry);
            Predicate anulado = cb.equal(rootEntry.get("anulado"), false);
            Date hoy = new java.sql.Date(new java.util.Date().getTime());
            Predicate fecha = cb.equal(rootEntry.get("fecha"), hoy);
            Predicate banco = cb.equal(rootEntry.get("efectivo"), efectivo);
            Predicate predicate = cb.and(fecha, anulado, banco);
            cq.where(predicate);
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
}
