package org.steambuff.method.steamuser.entity.enums;

/**
 * The enum Persona state.
 */
public enum PersonaState {
    /**
     * Offline persona state.
     */
    OFFLINE,
    /**
     * Online persona state.
     */
    ONLINE,
    /**
     * Busy persona state.
     */
    BUSY,
    /**
     * Away persona state.
     */
    AWAY,
    /**
     * Snooze persona state.
     */
    SNOOZE,
    /**
     * Looking to trade persona state.
     */
    LOOKING_TO_TRADE,
    /**
     * Looking to play persona state.
     */
    LOOKING_TO_PLAY;

    /**
     * Gets enum by int.
     *
     * @param personaStateInt the persona state int
     * @return the enum by int
     */
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
