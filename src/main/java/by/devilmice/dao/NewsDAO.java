package by.devilmice.dao;

import by.devilmice.model.NewsEntity;
import by.devilmice.utils.DAOInterface;
import by.devilmice.utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class NewsDAO implements DAOInterface<NewsEntity> {


    public NewsDAO(){

    }

    public void add(NewsEntity entity) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query query =  session.createQuery("delete NewsEntity where id = :param");
        query.setParameter("param", id);
        query.executeUpdate();
        tx.commit();
        session.close();
    }

    public void edit(NewsEntity entity) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("update NewsEntity set title = :titleParam, story = :storyParam, img = :imgParam, date = :dateParam where id = :idParam");
        query.setParameter("titleParam", entity.getTitle());
        query.setParameter("storyParam", entity.getStory());
        query.setParameter("dateParam", entity.getDate());
        query.setParameter("imgParam",  entity.getImg());
        query.setParameter("idParam", entity.getId());
        query.executeUpdate();

        session.getTransaction().commit();
        session.close();
    }

    public NewsEntity getById(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        ArrayList<NewsEntity> newsEntity;

        Query query = session.createQuery("From NewsEntity where id = :paramId");
        query.setParameter("paramId", id);

        newsEntity = (ArrayList<NewsEntity>) query.list();
        session.close();
        return newsEntity.get(0);


    }

    public ArrayList<NewsEntity> getAll() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        ArrayList<NewsEntity> newsList = (ArrayList<NewsEntity>)  session.createQuery("From NewsEntity ").list();
        session.close();
        return newsList;

    }
}
