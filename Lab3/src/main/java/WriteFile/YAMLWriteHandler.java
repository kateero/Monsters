package WriteFile;

import Entities.Monster;
import Storage.Storage;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.util.ArrayList;

public class YAMLWriteHandler extends BaseWriteHandler {

    @Override
    protected boolean canHandle(String filePath) {
        return filePath.endsWith("yml") || filePath.equals("yaml");
    }

    @Override
    protected void handle(String filePath, Storage storage) {

        YAMLMapper mapper = new YAMLMapper();
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
