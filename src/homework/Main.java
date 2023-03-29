package homework;
import homework.controller.UserSaverPersistance;
import homework.models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Jon");
        UserSaverPersistance userSaver = new UserSaverPersistance(user);
        userSaver.Save();
        user.report();
    }
}