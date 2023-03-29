package homework.models;

public class Persister {
    private  final  String name;
    private final User user;

    public Persister(User user) {
        this.user = user;
        name = user.getName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Persister{" +
                "user=" + user +
                '}';
    }
}
