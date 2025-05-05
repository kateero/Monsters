package ReadFile;

import Entities.Ingredient;
import Entities.Monster;
import Entities.Poison;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class XMLReadHandler extends BaseReadHandler {

    private boolean canHandle(String filePath) {
        return filePath.endsWith(".xml");
    }

    private ArrayList<Monster> handle(String filePath) throws FileNotFoundException {

        ArrayList<Monster> monsters = null;
        try {
            XMLInputFactory factory = XMLInputFactory.newFactory();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(filePath));

            Monster currentMonster = null;
            String fieldName = null;
            Poison currentPoison = null;
            Ingredient currentIngredient = null;

            while (reader.hasNext()) {
                int eventType = reader.next();

                switch (eventType) {
                    case XMLStreamConstants.START_ELEMENT: {
                        String elementName = reader.getLocalName();
                        switch (elementName) {
                            case "monsters" ->
                                monsters = new ArrayList<Monster>();
                            case "monster" -> {
                                currentMonster = new Monster();
                                currentMonster.setResource("xml");
                            }
                            case "poison" ->
                                currentPoison = new Poison();
                            case "ingredient" ->
                                currentIngredient = new Ingredient();
                            default ->
                                fieldName = elementName;
                        }
                        break;
                    }

                    case XMLStreamConstants.CHARACTERS: {
                        String value = reader.getText().trim();
                        if (value.isEmpty()) {
                            break;
                        }

                        switch (fieldName) {

                            case "name" ->
                                currentMonster.setName(value);
                            case "description" ->
                                currentMonster.setDescription(value);
                            case "danger" ->
                                currentMonster.setDanger(Integer.parseInt(value));
                            case "habitat" ->
                                currentMonster.addHabitat(value);
                            case "firstMention" ->
                                currentMonster.setFirstMention(LocalDate.parse(value));
                            case "height" ->
                                currentMonster.setHeight(Integer.parseInt(value));
                            case "weight" ->
                                currentMonster.setWeight(Integer.parseInt(value));
                            case "activityTime" ->
                                currentMonster.setActivityTime(value);
                            case "immunity" ->
                                currentMonster.addImmunity(value);
                            case "vulnerability" ->
                                currentMonster.setVulnerability(value);
                            case "nameIngredient" ->
                                currentIngredient.setNameIngredient(value);
                            case "quantity" ->
                                currentIngredient.setQuantity(Integer.parseInt(value));
                            case "cookingTime" ->
                                currentPoison.setCookingTime(Integer.parseInt(value));
                            case "efficiency" ->
                                currentPoison.setEfficiency(value);
                        }
                        break;
                    }

                    case XMLStreamConstants.END_ELEMENT: {
                        String elementName = reader.getLocalName();
                        switch (elementName) {
                            case "monster" ->
                                monsters.add(currentMonster);
                            case "ingredient" ->
                                currentPoison.setIngredient(currentIngredient);
                            case "poison" ->
                                currentMonster.setPoison(currentPoison);
                        }
                        break;
                    }
                }
            }
        } catch (XMLStreamException ex) {
            System.out.println("Ошибка чтения файла xml");
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
