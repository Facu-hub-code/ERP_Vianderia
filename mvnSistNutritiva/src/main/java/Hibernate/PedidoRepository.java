package Hibernate;

import Entidad.ClienteEntidad;
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
    public void save(PedidoEntidad pedidoEntidad) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(pedidoEntidad);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
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
    public void update(PedidoEntidad pedidoEntidad) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.merge(pedidoEntidad);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public void delete(PedidoEntidad pedidoEntidad) {

    }
}
