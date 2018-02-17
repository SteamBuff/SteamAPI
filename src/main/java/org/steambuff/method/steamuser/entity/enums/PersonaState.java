package org.steambuff.method.steamuser.entity.enums;

public enum PersonaState {
    OFFLINE,
    ONLINE,
    BUSY,
    AWAY,
    SNOOZE,
    LOOKING_TO_TRADE,
    LOOKING_TO_PLAY;

    public static PersonaState getEnumByInt(int personaStateInt) {
        switch (personaStateInt) {
            case 0:
                return OFFLINE;
            case 1:
                return ONLINE;
            case 2:
                return BUSY;
            case 3:
                return AWAY;
            case 4:
                return SNOOZE;
            case 5:
                return LOOKING_TO_TRADE;
            case 6:
                return LOOKING_TO_PLAY;
            default:
                return null;
        }
    }
}
