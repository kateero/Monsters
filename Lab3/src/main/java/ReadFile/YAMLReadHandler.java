package ReadFile;

import Entities.Monster;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class YAMLReadHandler extends BaseReadHandler {

    private boolean canHandle(String filePath) {
        return filePath.endsWith(".yaml") || filePath.endsWith(".yml");
    }

    private ArrayList<Monster> handle(String filePath) throws FileNotFoundException {
        ArrayList<Monster> monsters = new ArrayList<>();
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory()).registerModule(new JavaTimeModule());

            File file = new File(filePath);
            monsters = mapper.readValue(
                    file,
                    mapper.getTypeFactory().constructCollectionType(ArrayList.class, Monster.class)
            );
            for (Monster monster : monsters) {
                monster.setResource("yaml");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return monsters;
    }

    @Override
    public ArrayList<Monster> process(String filePath) throws FileNotFoundException {
        if (canHandle(filePath)) {
            return handle(filePath);
        } else if (getNext() != null) {
            return getNext().process(filePath);
        } else {
            return null;
        }
    }
}
