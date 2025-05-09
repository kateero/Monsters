package Controller;

import ReadFile.BaseReadHandler;
import ReadFile.JSONReadHandler;
import ReadFile.XMLReadHandler;
import ReadFile.YAMLReadHandler;
import Storage.Storage;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    private BaseReadHandler h1 = new XMLReadHandler();
    private BaseReadHandler h2 = new YAMLReadHandler();
    private BaseReadHandler h3 = new JSONReadHandler();
    private Storage storage = new Storage();

    public ReadFile() {
        h1.setNext(h2);
        h2.setNext(h3);
    }

    public void run(String filePath) throws FileNotFoundException, IOException {
        storage.setMonsters(h1.process(filePath));
        if (storage.getMonsters() == null) {
            throw new IOException("Файл не обработан");
        }
    }

    public Storage getStorage() {
        return storage;
    }
    
    
}
