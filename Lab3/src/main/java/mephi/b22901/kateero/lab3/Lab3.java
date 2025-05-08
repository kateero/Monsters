package mephi.b22901.kateero.lab3;

import Controller.ReadFile;
import GUI.GalaFrame;
import GUI.MonsterInfo;

public class Lab3 {

    public static void main(String[] args) {

        ReadFile readFile = new ReadFile();
        GalaFrame gf = new GalaFrame(readFile);
        gf.setLocationRelativeTo(null);
        gf.setVisible(true);
    }
}
