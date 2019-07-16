package eu.bramvanriel.diabloii_tool;

public class Diablo2GameState {
    public boolean CharacterCreated;
    public boolean CharacterRip;

    //act 1
    public boolean AndarielDone;

    //act 2
    public boolean CubeCollected;
    public boolean StaffCollected;
    public boolean AmuletCollected;
    public boolean DurielDone;

    //act 3
    public boolean EyeCollected;
    public boolean BrainCollected;
    public boolean HeartCollected;
    public boolean FlailCollected;
    public boolean MephistoDone;

    //act 4
    public boolean DiabloDone;

    //act 5
    public boolean AncientsDone;
    public boolean BaalDone;

    public static class StateChange {
        static String LeveledUp = "LeveledUp";
    }

    private int level = 1;
    private final String cmdLevelUp1 = "level up";
    private final String cmdLevelUp2 = "leveled up";

    public String CharacterLevel() {
        return Integer.toString(level);
    }

    public String TryCommand(String command) {
        switch (command) {
            case cmdLevelUp1:
            case cmdLevelUp2:
                level++;
                return StateChange.LeveledUp;
        }
        return null;
    }
}
