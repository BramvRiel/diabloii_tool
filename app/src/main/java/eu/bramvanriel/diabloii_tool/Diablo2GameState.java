package eu.bramvanriel.diabloii_tool;

class Diablo2GameState {
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
        final static String CharacterCreated = "New Character";
        final static String LeveledUp = "Leveled Up";
        final static String Rip = "Rip";
        final static String DefeatedAndariel = "Defeated Andariel";
        final static String CollectedCube = "Collected Horadric Cube";
        final static String CollectedStaff = "Collected Horadric Staff";
        final static String CollectedAmulet = "Collected Viper Amulet";
        final static String DefeatedDuriel = "Defeated Duriel";
        final static String CollectedEye = "Collected Eye Amulet";
        final static String CollectedBain = "Collected Brain Amulet";
        final static String CollectedHeart = "Collected Heart Amulet";
        final static String CollectedFlail = "Collected Flail";
        final static String DefeatedMephisto = "Defeated Mephisto";
        final static String DefeatedDiablo = "Defeated Diablo";
        final static String DefeatedAncients = "Defeated Ancients";
        final static String DefeatedBaal = "Defeated Baal";
    }

    private int level = 0;


    public String CharacterLevel() {
        return Integer.toString(level);
    }

    public void EnterVoiceCommand(String command) {
        switch (command) {
            case StateChange.CharacterCreated:
                CharacterCreated = true;
                level = 1;
                AndarielDone = false;
                CubeCollected = false;
                StaffCollected = false;
                AmuletCollected = false;
                DurielDone = false;
                EyeCollected = false;
                BrainCollected = false;
                HeartCollected = false;
                FlailCollected = false;
                MephistoDone = false;
                DiabloDone = false;
                AncientsDone = false;
                BaalDone = false;
                CharacterRip = false;
                break;
            case StateChange.LeveledUp:
                level++;
                break;
            case StateChange.Rip:
                CharacterRip = true;
                level = 0;
                break;
            case StateChange.DefeatedAndariel:
                AndarielDone = true;
                break;
            case StateChange.CollectedCube:
                CubeCollected = true;
                break;
            case StateChange.CollectedStaff:
                StaffCollected = true;
                break;
            case StateChange.CollectedAmulet:
                AmuletCollected = true;
                break;
            case StateChange.DefeatedDuriel:
                DurielDone = true;
                break;
            case StateChange.CollectedEye:
                EyeCollected = true;
                break;
            case StateChange.CollectedBain:
                BrainCollected = true;
                break;
            case  StateChange.CollectedHeart:
                HeartCollected = true;
                break;
            case StateChange.CollectedFlail:
                FlailCollected = true;
                break;
            case StateChange.DefeatedMephisto:
                MephistoDone = true;
                break;
            case StateChange.DefeatedDiablo:
                DiabloDone = true;
                break;
            case StateChange.DefeatedAncients:
                AncientsDone = true;
                break;
            case StateChange.DefeatedBaal:
                BaalDone = true;
                break;
        }
    }
}
