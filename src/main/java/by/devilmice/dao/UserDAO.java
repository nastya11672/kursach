package by.devilmice.dao;

import by.devilmice.model.NewsEntity;
import by.devilmice.model.UsersEntity;
import by.devilmice.utils.DAOInterface;
import by.devilmice.utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class UserDAO implements DAOInterface<UsersEntity> {

    public UserDAO(){

    }
    public void add(UsersEntity entity) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query query =  session.createQuery("delete UsersEntity where id = :param");
        query.setParameter("param", id);
        query.executeUpdate();
        tx.commit();
        session.close();
    }

    public void edit(UsersEntity entity) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("update UsersEntity set login = :loginParam, password = :passwordParam, email = :emailParam, role = :roleParam where id = :idParam");

        query.setParameter("loginParam", entity.getLogin());
        query.setParameter("passwordParam", entity.getPassword());
        query.setParameter("emailParam", entity.getEmail() );
        query.setParameter("roleParam", entity.getRole());
        query.setParameter("idParam", entity.getId());
        query.executeUpdate();


        session.getTransaction().commit();
        session.close();
    }


    public void profileChange(String email, String password, int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Query query ;
        if(password.equals("")) {
            query = session.createQuery("update UsersEntity set  email = :emailParam where id = :idParam");


        } else {
            query = session.createQuery("update UsersEntity set password = :passwordParam,email = :emailParam where id = :idParam");
            query.setParameter("passwordParam", password);
        }
        query.setParameter("emailParam", email );
        query.setParameter("idParam", id );

        session.beginTransaction();
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    public UsersEntity getById(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        ArrayList<UsersEntity> usersList;

        Query query = session.createQuery("From UsersEntity where id = :paramId");
        query.setParameter("paramId", id);

        usersList = (ArrayList<UsersEntity>) query.list();
        session.close();
        return usersList.get(0);
    }

    public ArrayList<UsersEntity> getAll() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        ArrayList<UsersEntity> usersList = (ArrayList<UsersEntity>)  session.createQuery("From UsersEntity ").list();
        session.close();
        return usersList;
    }


    public UsersEntity getByLoginPassword(String login, String password) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        UsersEntity user = new UsersEntity();
        Query query = session.createQuery("from UsersEntity where login = :paramLogin and password = :paramPassword");
        query.setParameter("paramLogin", login);
        query.setParameter("paramPassword", password);
        ArrayList<UsersEntity> users = null;
        users = (ArrayList<UsersEntity>) query.list();
        user = users.get(0);
        session.close();
        return user;
    }

    public int auth(String login, String password){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Query query = session.createQuery("from UsersEntity where login = :paramLogin and password = :paramPassword");
        query.setParameter("paramLogin", login);
        query.setParameter("paramPassword", password);
        ArrayList<UsersEntity> user = null;
        user = (ArrayList<UsersEntity>) query.list();
        session.close();
        if(user.size()==0){
            return 0;
        } else{
            return 1;
        }
    }

    public int checkLogin(String login){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Query query = session.createQuery("from UsersEntity where login = :paramLogin");
        query.setParameter("paramLogin", login);
        ArrayList<UsersEntity> user = null;
        user = (ArrayList<UsersEntity>) query.list();
        session.close();
        if(user.size()==0){
            return 0;
        } else{
            return 1;
        }
    }
}
