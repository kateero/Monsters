package ReadFile;

import Entities.Monster;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class JSONReadHandler extends BaseReadHandler {

    private boolean canHandle(String filePath) {
        return filePath.endsWith(".json");
    }

    private ArrayList<Monster> handle(String filePath) throws FileNotFoundException, IOException {
        ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        try {
            monsters = mapper.readValue(
                    new File(filePath),
                    new TypeReference<ArrayList<Monster>>() {
            }
            );
        } catch (StreamReadException ex) {
            System.err.println("Файл содержит синтаксические ошибки");
        } catch (DatabindException ex) {
            System.err.println("Структура данных не соответствует ожидаемой");
        } 
            for (Monster monster : monsters) {
                monster.setResource("json");
            }

            return monsters;

        }

        @Override
        public ArrayList<Monster> process (String filePath) throws FileNotFoundException, IOException {
            if (canHandle(filePath)) {
                return handle(filePath);
            } else if (getNext() != null) {
                return getNext().process(filePath);
            } else {
                return null;
            }
        }
    }
