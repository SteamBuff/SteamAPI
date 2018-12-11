package org.steambuff.method.steamuser.entity.enums;

/**
 * The enum Profile state.
 */
public enum ProfileState {
    /**
     * Misconfigured profile state.
     */
    MISCONFIGURED,
    /**
     * Configured profile state.
     */
    CONFIGURED;

    /**
     * Gets enum by int.
     *
     * @param profileStateInt the profile state int
     * @return the enum by int
     */
    public static ProfileState getEnumByInt(int profileStateInt) {
        switch (profileStateInt) {
            case 0:
                return ProfileState.MISCONFIGURED;
            case 1:
                return ProfileState.CONFIGURED;
            default:
                return null;
        }
    }
}
