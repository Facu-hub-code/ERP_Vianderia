package Repository;

import Entidad.PedidoEntidad;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PedidoRepository implements Repository<PedidoEntidad> {

    @Override
    public boolean save(PedidoEntidad pedidoEntidad) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(pedidoEntidad);
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
    public List<PedidoEntidad> findAll() {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<PedidoEntidad> cq = cb.createQuery(PedidoEntidad.class);
            Root<PedidoEntidad> rootEntry = cq.from(PedidoEntidad.class);
            CriteriaQuery<PedidoEntidad> all = cq.select(rootEntry);
            Predicate anulado = cb.equal(rootEntry.get("anulado"), false);
            cq.where(anulado);
            TypedQuery<PedidoEntidad> allQuery = sesion.createQuery(all);
            ArrayList<PedidoEntidad> pedidos = (ArrayList<PedidoEntidad>) allQuery.getResultList();
            return pedidos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public PedidoEntidad findbyID(int id) {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<PedidoEntidad> cq = cb.createQuery(PedidoEntidad.class);
            Root<PedidoEntidad> rootEntry = cq.from(PedidoEntidad.class);
            CriteriaQuery<PedidoEntidad> all = cq.select(rootEntry);

            Predicate identidad = cb.equal(rootEntry.get("id"), id);
            cq.where(identidad);

            TypedQuery<PedidoEntidad> allQuery = sesion.createQuery(all);
            ArrayList<PedidoEntidad> pedidos = (ArrayList<PedidoEntidad>) allQuery.getResultList();
            return pedidos.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public boolean update(PedidoEntidad pedidoEntidad) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.merge(pedidoEntidad);
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

    public ArrayList<PedidoEntidad> findAlmuerzos() {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<PedidoEntidad> cq = cb.createQuery(PedidoEntidad.class);
            Root<PedidoEntidad> rootEntry = cq.from(PedidoEntidad.class);
            CriteriaQuery<PedidoEntidad> all = cq.select(rootEntry);

            Predicate anulado = cb.equal(rootEntry.get("anulado"), false);
            Predicate tipo1 = cb.equal(rootEntry.get("tipo"), "ALMUERZO");
            Predicate tipo2 = cb.equal(rootEntry.get("tipo"), "ALMUERZOCARNE");
            Predicate tipo3 = cb.equal(rootEntry.get("tipo"), "ALMUERZOPESCADO");
            Predicate almuerzo = cb.or(tipo1, tipo2, tipo3);
            Predicate predicate = cb.and(almuerzo, anulado);
            cq.where(predicate);

            TypedQuery<PedidoEntidad> allQuery = sesion.createQuery(all);
            ArrayList<PedidoEntidad> pedidos = (ArrayList<PedidoEntidad>) allQuery.getResultList();
            return pedidos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public ArrayList<PedidoEntidad> findCenas() {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<PedidoEntidad> cq = cb.createQuery(PedidoEntidad.class);
            Root<PedidoEntidad> rootEntry = cq.from(PedidoEntidad.class);
            CriteriaQuery<PedidoEntidad> all = cq.select(rootEntry);

            Predicate anulado = cb.equal(rootEntry.get("anulado"), false);
            Predicate tipo1 = cb.equal(rootEntry.get("tipo"), "CENA");
            Predicate tipo2 = cb.equal(rootEntry.get("tipo"), "CENACARNE");
            Predicate tipo3 = cb.equal(rootEntry.get("tipo"), "CENAPESCADO");
            Predicate cena = cb.or(tipo1, tipo2, tipo3);
            Predicate predicate = cb.and(cena, anulado);
            cq.where(predicate);

            TypedQuery<PedidoEntidad> allQuery = sesion.createQuery(all);
            ArrayList<PedidoEntidad> pedidos = (ArrayList<PedidoEntidad>) allQuery.getResultList();
            return pedidos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }
}
