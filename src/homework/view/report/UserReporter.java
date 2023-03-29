package homework.view.report;

import homework.models.User;

public class UserReporter implements Reportable {
    private final User user;
    private final String name;

    public UserReporter(User user) {
        this.user = user;
        name = user.getName();
    }

    public String getName() {
        return name;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + name);
    }

    @Override
    public String toString() {
        return "UserReport{" + "user=" + user + ", name='" + name + '\'' + '}';
    }
}
