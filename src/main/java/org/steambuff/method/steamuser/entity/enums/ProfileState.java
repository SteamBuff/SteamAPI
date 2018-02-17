package org.steambuff.method.steamuser.entity.enums;

public enum ProfileState {
    MISCONFIGURED,
    CONFIGURED;

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
