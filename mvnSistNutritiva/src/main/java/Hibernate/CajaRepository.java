package Hibernate;

import Entidad.CierreCajaEntidad;
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

    public CierreCajaEntidad getUltimoCierre() {
        Session sesion = HibernateUtil.getSession();        //Obtener el objeto estático Session
        try {
            //Crear la query criteria para usuarios
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<CierreCajaEntidad> cq = cb.createQuery(CierreCajaEntidad.class);
            Root<CierreCajaEntidad> rootEntry = cq.from(CierreCajaEntidad.class);
            CriteriaQuery<CierreCajaEntidad> all = cq.select(rootEntry);
//            Predicate anulado = cb.equal(rootEntry.get("anulado"), false);
//            cq.where(anulado);
            cq.orderBy(cb.desc(rootEntry.get("fechaCierre")));
            //Hacer la consulta a la BDD\s
            TypedQuery<CierreCajaEntidad> allQuery = sesion.createQuery(all);
            //casteamos el resultado de la query a un arraylist
            ArrayList<CierreCajaEntidad> cierrecajaEntidads = (ArrayList<CierreCajaEntidad>) allQuery.getResultList();
            if(cierrecajaEntidads.size() > 0)
                return cierrecajaEntidads.get(0);
            else
                return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public boolean save(CierreCajaEntidad nuevoCierre) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(nuevoCierre);
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

    public boolean update(CierreCajaEntidad cierrecajaEntidad) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.merge(cierrecajaEntidad);
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
}
