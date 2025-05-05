package ReadFile;

import Entities.Monster;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class YAMLReadHandler extends BaseReadHandler {
    
    @Override
    public boolean canHandle(String filePath){
        return filePath.endsWith(".yaml") || filePath.endsWith(".yml");
    }
    
    @Override
    public ArrayList<Monster> handle(String filePath) throws FileNotFoundException {
        ArrayList<Monster> monsters = new ArrayList<>();
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            
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
}
