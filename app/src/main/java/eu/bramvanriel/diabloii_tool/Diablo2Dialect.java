package eu.bramvanriel.diabloii_tool;

class Diablo2Dialect {

    private final String cmdCharacterCreated1 = "character created";
    private final String cmdCharacterCreated2 = "new character";
    private final String cmdLevelUp1 = "level up";
    private final String cmdLevelUp2 = "leveled up";
    private final String cmdRip1 = "rest in peace";
    private final String cmdRip2 = "game over";
    private final String cmdDefeatedAndariel1 = "defeated andariel";
    private final String cmdCollectedCube1 = "cube";
    private final String cmdCollectedAmulet1 = "amulet";
    private final String cmdCollectedStaff1 = "staff";
    private final String cmdDefeatedDuriel1 = "defeated duriel";
    private final String cmdCollectedEye1 = "eye";
    private final String cmdCollectedBrain1 = "brain";
    private final String cmdCollectedHeart1 = "heart";
    private final String cmdCollectedFlail1 = "flail";
    private final String cmdDefeatedMephisto1 = "defeated mephisto";
    private final String cmdDefeatedDiablo1 = "defeated diablo";
    private final String cmdDefeatedAncients1 = "defeated ancients";
    private final String cmdDefeatedBaal1 = "defeated baal";

    public String GetTranslatedCommand(String speech) {
        switch (speech.toLowerCase()) {
            case cmdCharacterCreated1:
            case cmdCharacterCreated2:
                return Diablo2GameState.StateChange.CharacterCreated;
            case cmdLevelUp1:
            case cmdLevelUp2:
                return Diablo2GameState.StateChange.LeveledUp;
            case cmdRip1:
            case cmdRip2:
                return Diablo2GameState.StateChange.Rip;
            case cmdDefeatedAndariel1:
                return Diablo2GameState.StateChange.DefeatedAndariel;
            case cmdCollectedCube1:
                return Diablo2GameState.StateChange.CollectedCube;
            case cmdCollectedAmulet1:
                return Diablo2GameState.StateChange.CollectedAmulet;
            case cmdCollectedStaff1:
                return Diablo2GameState.StateChange.CollectedStaff;
            case cmdDefeatedDuriel1:
                return Diablo2GameState.StateChange.DefeatedDuriel;
            case cmdCollectedEye1:
                return Diablo2GameState.StateChange.CollectedEye;
            case cmdCollectedBrain1:
                return Diablo2GameState.StateChange.CollectedBain;
            case cmdCollectedHeart1:
                return Diablo2GameState.StateChange.CollectedHeart;
            case cmdCollectedFlail1:
                return Diablo2GameState.StateChange.CollectedFlail;
            case cmdDefeatedMephisto1:
                return Diablo2GameState.StateChange.DefeatedMephisto;
            case cmdDefeatedDiablo1:
                return Diablo2GameState.StateChange.DefeatedDiablo;
            case cmdDefeatedAncients1:
                return Diablo2GameState.StateChange.DefeatedAncients;
            case cmdDefeatedBaal1:
                return Diablo2GameState.StateChange.DefeatedBaal;
        }
        return null;
    }
}
