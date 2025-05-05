package ReadFile;

import Entities.Monster;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface ReadHandler {

    public void setNext(ReadHandler rh);
    
    public boolean canHandle(String filePath);
    
    public ArrayList<Monster> handle(String filePath) throws FileNotFoundException;
}
