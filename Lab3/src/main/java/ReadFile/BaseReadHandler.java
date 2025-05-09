package ReadFile;

import Entities.Monster;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public abstract class BaseReadHandler {

    private BaseReadHandler next;

    public void setNext(BaseReadHandler rh) {
        this.next = rh;
    }

    public BaseReadHandler getNext() {
        return next;
    }

    public abstract ArrayList<Monster> process(String filePath) throws FileNotFoundException, IOException;

}
