package homework;
import homework.controller.UserSaverPersistance;
import homework.models.User;
import homework.view.report.UserReporter;

public class Main {
    public static void main(String[] args) {
        User user = new User("Jon");
        UserSaverPersistance userSaver = new UserSaverPersistance(user);
        userSaver.Save();
        UserReporter reporter = new UserReporter(user);
        reporter.report();
    }
}