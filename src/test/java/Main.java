import models.Auto;
import models.Person;
import services.UserService;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


        UserService userService = new UserService();
        Person person = new Person("Masha",26);
        userService.saveUser(person);
        Auto ferrari = new Auto("Ferrari", "red");
        person.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setPerson(person);
        person.addAuto(ford);
        userService.updateUser(person);
        person.setName("Roma");
        userService.updateUser(person);


    }
}