package ReadFile;

import Entities.Monster;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class JSONReadHandler extends BaseReadHandler {
    
    @Override
    public boolean canHandle(String filePath){
        return filePath.endsWith(".json");
    }

    @Override
    public ArrayList<Monster> handle(String filePath) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());;
        ArrayList<Monster> monsters = new ArrayList<Monster>();

        try {
            monsters = mapper.readValue(
                    new File(filePath),
                    new TypeReference<ArrayList<Monster>>() {
            }
            );
            for (Monster monster : monsters) {
                monster.setResource("json");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return monsters;

    }
}
