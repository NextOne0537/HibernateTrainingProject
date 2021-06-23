import models.Auto;
import models.Person;
import org.checkerframework.checker.units.qual.A;
import services.UserService;
import utils.HibernateSessionFactoryUtil;

import java.sql.SQLException;
import java.util.List;

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
        Auto auto = userService.findAuto(10);
        Person person = userService.findUser(7);
        person.addAuto(auto);
        userService.updateUser(person);





    }
}