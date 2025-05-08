package Controller;

import Storage.Storage;
import WriteFile.BaseWriteHandler;
import WriteFile.JSONWriteHandler;
import WriteFile.XMLWriteHandler;
import WriteFile.YAMLWriteHandler;

public class WriteFile {
    private BaseWriteHandler h1 = new XMLWriteHandler();
    private BaseWriteHandler h2 = new JSONWriteHandler();
    private BaseWriteHandler h3 = new YAMLWriteHandler();
    private Storage storage;
    
    public WriteFile(){
        h1.setNext(h2);
        h2.setNext(h3);
    }
    
    public void run(String filePath) throws Exception{
        h1.process(filePath, storage);
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
