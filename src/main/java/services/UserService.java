package services;

import dao.UserDAO;
import models.Auto;
import models.User;

import java.util.List;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public UserService(){

    }
    public User findUser(int id){
        return userDAO.findById(id);
    }

    public void saveUser(User user){
        userDAO.save(user);
    }

    public void deleteUser(User user){
        userDAO.delete(user);
    }

    public void updateUser (User user){
        userDAO.update(user);
    }

    public List<User> findAllUsers () {
        return userDAO.findAllUsers();
    }

    public Auto findAuto (int id){
        return userDAO.findAutoById(id);
    }



}
