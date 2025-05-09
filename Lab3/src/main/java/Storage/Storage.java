package Storage;

import Entities.Monster;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "monsters")
@XmlAccessorType(XmlAccessType.FIELD)
public class Storage {
    @XmlElement(name = "monster")
    private ArrayList<Monster> monsters = null;

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

}
