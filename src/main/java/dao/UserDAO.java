package dao;

import models.Auto;
import models.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import org.hibernate.query.Query;
import java.util.List;

public class UserDAO {

    public Person findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Person person = session.get(Person.class,id);
        session.close();
        return person;
//        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Person.class,id);
    }

    public void save (Person person){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(person);
        tx1.commit();
        session.close();
    }

    public void update (Person person){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(person);
        tx1.commit();
        session.close();
    }

    public void delete (Person person){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(person);
        tx1.commit();
        session.close();
    }

    public Auto findAutoById (int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Auto result = session.get(Auto.class,id);
        session.close();
        return result;
    }

    public List<Person> findAllUsers (){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List <Person> people = (List<Person>) session.createQuery("From Person").list();
        session.close();
        return people;
    }

//    public Query createQuery (String queryString){
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Query query = session.createQuery(queryString);
//        session.close();
//        return query;
//
//    }

}
