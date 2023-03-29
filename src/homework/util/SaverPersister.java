package homework.util;

import homework.models.Persister;
import homework.util.impl.SaveToConsole;

public class SaverPersister implements SaveToConsole {
    private final Persister persister;

    public SaverPersister(Persister persister) {
        this.persister = persister;
    }

    @Override
    public void saveToConsole() {
        System.out.println("save user : " + persister.getName());
    }
}
