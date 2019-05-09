package by.devilmice.dao;

import by.devilmice.model.SettingsEntity;
import by.devilmice.utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class SettingsDAO {

    public SettingsDAO(){
    }

    public SettingsEntity getSettings() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        ArrayList<SettingsEntity> settingList = (ArrayList<SettingsEntity>)  session.createQuery("From SettingsEntity ").list();
        session.close();
        return settingList.get(0);
    }

    public void setSettings(SettingsEntity s) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("update SettingsEntity set title = :titleParam, keywords = :keywordsParam, description = :descParam, offline = :offlineParam where id = :idParam");

        query.setParameter("titleParam", s.getTitle());
        query.setParameter("keywordsParam", s.getKeywords());
        query.setParameter("descParam", s.getDescription() );
        query.setParameter("offlineParam", s.getOffline());
        query.setParameter("idParam", 1);
        query.executeUpdate();


        session.getTransaction().commit();
        session.close();


    }

}
