package ReadFile;

import Entities.Monster;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface ReadHandler {

    public void setNext(ReadHandler rh);
    
    public ReadHandler getNext();
    
    public ArrayList<Monster> process(String filePath) throws FileNotFoundException;
}
