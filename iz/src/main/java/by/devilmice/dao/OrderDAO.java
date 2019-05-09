package by.devilmice.dao;

import by.devilmice.model.OrdersEntity;
import by.devilmice.utils.DAOInterface;
import by.devilmice.utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class OrderDAO implements DAOInterface<OrdersEntity> {

    public OrderDAO(){

    }
    @Override
    public void add(OrdersEntity entity) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query query =  session.createQuery("delete OrdersEntity where id = :param");
        query.setParameter("param", id);
        query.executeUpdate();
        tx.commit();
        session.close();
    }

    @Override
    public void edit(OrdersEntity entity) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("update OrdersEntity set fio = :fioParam, phone = :phoneParam, address = :addressParam, comment = :commentParam, status = :statusParam where id = :idParam");

        query.setParameter("fioParam", entity.getFio());
        query.setParameter("phoneParam", entity.getPhone());
        query.setParameter("addressParam", entity.getAddress());
        query.setParameter("commentParam",  entity.getComment());
        query.setParameter("statusParam",  entity.getStatus());
        query.setParameter("idParam", entity.getId());
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public OrdersEntity getById(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        ArrayList<OrdersEntity> orderList;

        Query query = session.createQuery("From OrdersEntity where id = :paramId");
        query.setParameter("paramId", id);

        orderList = (ArrayList<OrdersEntity>) query.list();
        session.close();
        return orderList.get(0);
    }

    @Override
    public ArrayList<OrdersEntity> getAll() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        ArrayList<OrdersEntity> orderList = (ArrayList<OrdersEntity>)  session.createQuery("From OrdersEntity ORDER BY id DESC").list();
        session.close();
        return orderList;
    }
    public ArrayList<OrdersEntity> getAllByUserId(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        ArrayList<OrdersEntity> orderList;
        Query query = session.createQuery("From OrdersEntity where usersEntity.id = :paramId ORDER BY id desc");
        query.setParameter("paramId", id);
        orderList = (ArrayList<OrdersEntity>) query.list();
        session.close();
        return orderList;
    }
}
