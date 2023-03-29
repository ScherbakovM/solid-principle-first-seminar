package homework;

import homework.util.Persister;
import homework.util.SaverPersister;

public class Main {
    public static void main(String[] args) {
        User user = new User("Jon");
        User user1 = new User("Roy");
        Persister persister = new Persister(user); // копия юзер
        SaverPersister saver = new SaverPersister(persister); // инициализация класса для сохранения
        saver.saveToConsole();
        user.report();
    }
}