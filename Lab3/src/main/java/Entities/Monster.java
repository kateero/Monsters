package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import org.yaml.snakeyaml.nodes.ScalarNode;

public class Monster {

    private String resource;
    private String name;
    private String description;
    private int danger;
    private ArrayList<String> habitat = new ArrayList<String>();
    private String firstMention;
    private int height;
    private int weight;
    private String activityTime;
    private ArrayList<String> immunity = new ArrayList<String>();
    private String vulnerability;
    private Poison poison;

    public Monster() {
    }

    public String getResource() {
        return resource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDanger() {
        return danger;
    }

    public ArrayList<String> getHabitat() {
        return habitat;
    }

    public ArrayList<String> getImmunity() {
        return immunity;
    }

    public String getFirstMention() {
        return firstMention;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getActivityTime() {
        return activityTime;
    }

    public Poison getPoison() {
        return poison;
    }

    public String getVulnerability() {
        return vulnerability;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDanger(int danger) {
        this.danger = danger;
    }

    public void setHabitat(ArrayList<String> habitat) {
        this.habitat = habitat;
    }

    public void addHabitat(String habitat) {
        this.habitat.add(habitat);
    }

    public void setFirstMention(String firstMention) {
        this.firstMention = firstMention;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    public void setImmunity(ArrayList<String> immunity) {
        this.immunity = immunity;
    }

    public void addImmunity(String immunity) {
        this.immunity.add(immunity);
    }

    public void setPoison(Poison poison) {
        this.poison = poison;
    }

    public void setVulnerability(String vulnerability) {
        this.vulnerability = vulnerability;
    }

}
