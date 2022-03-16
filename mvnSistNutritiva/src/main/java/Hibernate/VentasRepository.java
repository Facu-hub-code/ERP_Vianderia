package Hibernate;

import Entidad.PedidoEntidad;
import Entidad.VentaEntidad;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class VentasRepository implements Repository<VentaEntidad> {
    @Override
    public void save(VentaEntidad venta) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(venta);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public List<VentaEntidad> findAll() {
        Session sesion = HibernateUtil.getSession();
        try {
            CriteriaBuilder cb = sesion.getCriteriaBuilder();
            CriteriaQuery<VentaEntidad> cq = cb.createQuery(VentaEntidad.class);
            Root<VentaEntidad> rootEntry = cq.from(VentaEntidad.class);
            CriteriaQuery<VentaEntidad> all = cq.select(rootEntry);
            Predicate anulado = cb.equal(rootEntry.get("anulado"), false);
            cq.where(anulado);
            TypedQuery<VentaEntidad> allQuery = sesion.createQuery(all);
            ArrayList<VentaEntidad> ventas = (ArrayList<VentaEntidad>) allQuery.getResultList();
            return ventas;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public VentaEntidad findbyID(int id) {
        return null;
    }

    @Override
    public void update(VentaEntidad ventaEntidad) {

    }
}
