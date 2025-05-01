package Entities;

import java.time.LocalDate;

public class Monster {

    private String resource;
    private String name;
    private String description;
    private int danger;
    private String[] habitat;
    private LocalDate firstMention;
    private int height;
    private int weight;
    private String activityTime;
    private String[] immunity;
    private String vulnerability;
    private Poison poison;

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

    public String[] getHabitat() {
        return habitat;
    }

    public LocalDate getFirstMention() {
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

    public String[] getImmunity() {
        return immunity;
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

    public void setHabitat(String[] habitat) {
        this.habitat = habitat;
    }

    public void setFirstMention(LocalDate firstMention) {
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

    public void setImmunity(String[] immunity) {
        this.immunity = immunity;
    }

    public void setPoison(Poison poison) {
        this.poison = poison;
    }

    public void setVulnerability(String vulnerability) {
        this.vulnerability = vulnerability;
    }

}
