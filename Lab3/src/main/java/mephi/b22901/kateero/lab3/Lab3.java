package mephi.b22901.kateero.lab3;

import Controller.ReadFile;
import Controller.WriteFile;
import GUI.GalaFrame;

public class Lab3 {

    public static void main(String[] args) {
                ReadFile readFile = new ReadFile();
                WriteFile writeFile = new WriteFile();
                GalaFrame gf = new GalaFrame(readFile, writeFile);
                gf.setLocationRelativeTo(null);
                gf.setVisible(true);
    }
}
