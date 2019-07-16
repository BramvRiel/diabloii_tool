package eu.bramvanriel.diabloii_tool;

import java.util.ArrayList;

public class Diablo2Dialect {

    private ArrayList commands = new ArrayList();
    private String strLevelUp = "level up";

    public Diablo2Dialect() {
        commands.add(strLevelUp);
    }

    public boolean IsRecognizedAsDiabloDialect(String speech) {
        return commands.contains(speech);
    }
}
