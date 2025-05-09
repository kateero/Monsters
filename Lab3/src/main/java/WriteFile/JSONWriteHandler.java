package WriteFile;

import Entities.Monster;
import Storage.Storage;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.util.ArrayList;

public class JSONWriteHandler extends BaseWriteHandler {

    @Override
    protected boolean canHandle(String filePath) {
        return filePath.endsWith(".json");
    }

    @Override
    protected void handle(String filePath, Storage storage) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        ArrayList<Monster> monsters = storage.getMonsters();
        try {
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File(filePath), monsters);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
