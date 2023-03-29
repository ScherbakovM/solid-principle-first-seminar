package homework.controller;

import homework.models.Persister;
import homework.models.User;
import homework.util.SaverPersister;

public class UserSaverPersistance {
    private final User user;

    public UserSaverPersistance(User user) {
        this.user = user;
    }

    public void Save() {
        Persister persister = new Persister(user);
        SaverPersister saver = new SaverPersister(persister);
        saver.saveToConsole();
    }

}
