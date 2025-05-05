package mephi.b22901.kateero.lab3;

import Controller.ReadFile;
import Entities.Monster;
import GUI.ChoseFile;
import GUI.GalaFrame;
import ReadFile.JSONReadHandler;
import ReadFile.XMLReadHandler;
import ReadFile.YAMLReadHandler;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Lab3 {

    public static void main(String[] args) throws FileNotFoundException {
//        XMLReadHandler rh = new XMLReadHandler();
//        try {
//        ArrayList<Monster> monsters = rh.handle("C:\\Users\\Катя\\OneDrive\\Рабочий стол\\Monsters.xml");
//      
//        for (int i = 0; i < 10; i++) {
//            System.out.println(monsters.get(i).getFirstMention());
//        }
//        } catch (FileNotFoundException ex){
//            System.err.println("Can't read file!");
//        }
//        JSONReadHandler jrh = new JSONReadHandler();
//        ArrayList<Monster> m = jrh.handle("C:\\Users\\Катя\\OneDrive\\Рабочий стол\\Monsters.json");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(m.get(i).getFirstMention());
//        }
//        YAMLReadHandler yrh = new YAMLReadHandler();
//        ArrayList<Monster> m = yrh.handle("C:\\Users\\Катя\\OneDrive\\Рабочий стол\\Monsters.yml");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(m.get(i).getFirstMention());
//        }
//    }
        ReadFile readFile = new ReadFile();
        GalaFrame gf = new GalaFrame(readFile);
        gf.setLocationRelativeTo(null);
        gf.setVisible(true);
    }
}
