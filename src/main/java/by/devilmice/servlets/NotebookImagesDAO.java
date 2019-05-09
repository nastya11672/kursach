package by.devilmice.servlets;

import by.devilmice.model.NotebookEntity;
import by.devilmice.model.NotebookImagesEntity;
import by.devilmice.utils.DAOInterface;
import by.devilmice.utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class NotebookImagesDAO implements DAOInterface<NotebookImagesEntity> {

    @Override
    public void add(NotebookImagesEntity entity) {
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
        Query query =  session.createQuery("delete NotebookImagesEntity where id = :param");
        query.setParameter("param", id);
        query.executeUpdate();
        tx.commit();
    }

    @Override
    public void edit(NotebookImagesEntity entity) {

    }

    @Override
    public NotebookImagesEntity getById(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Query query = session.createQuery("from NotebookImagesEntity where id = :paramName");
        query.setParameter("paramName", id);
        ArrayList<NotebookImagesEntity> list = (ArrayList<NotebookImagesEntity>) query.list();
        return list.get(0);
    }

    @Override
    public ArrayList<NotebookImagesEntity> getAll() {
        return null;
    }
}
