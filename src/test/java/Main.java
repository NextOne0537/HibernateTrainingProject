import models.Auto;
import models.Person;
import services.UserService;
import utils.HibernateSessionFactoryUtil;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


        UserService userService = new UserService();
//        Person person = new Person("Masha",26);
//        Auto ferrari = new Auto("Ferrari", "red");
//        person.addAuto(ferrari);
//        ferrari.setPerson(person);
//        userService.saveUser(person);

//        Auto ford = new Auto("Ford", "black");
//        ford.setPerson(person);
//        person.addAuto(ford);
//        userService.updateUser(person);
//        person.setName("Vasya");
//        person.setAge(34);
//        userService.updateUser(person);
//       toChange.removeAuto(userService.findAuto(1));
//       toChange.removeAuto(userService.findAuto(2));
        System.out.println(userService.findUser(7));




    }
}