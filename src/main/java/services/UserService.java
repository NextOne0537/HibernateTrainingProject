package services;

import dao.UserDAO;
import models.Auto;
import models.Person;
import org.hibernate.query.Query;

import java.util.List;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public UserService(){

    }
    public Person findUser(int id)  {
        return userDAO.findById(id);
    }

    public void saveUser(Person person){
        userDAO.save(person);
    }

    public void deleteUser(Person person){
        userDAO.delete(person);
    }

    public void updateUser (Person person){
        userDAO.update(person);
    }

    public List<Person> findAllUsers () {
        return userDAO.findAllUsers();
    }

    public Auto findAuto (int id){
        return userDAO.findAutoById(id);
    }

//    public Query query (String query) {return userDAO.createQuery(query);}



}
