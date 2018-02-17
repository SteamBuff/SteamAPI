package org.steambuff.method.steamuser.entity.enums;

public enum CommunityVisibilityState {

    PUBLIC,
    PRIVATE;


    /**
     * Getting Enum by integer
     *
     * @param communityVisibilityStateId Unique id Enum
     * @return {@code null} if communityVisibilityStateId undefined else return Enum
     */
    public static CommunityVisibilityState getEnumByInt(int communityVisibilityStateId) {
        switch (communityVisibilityStateId) {
            case 1:
                return CommunityVisibilityState.PUBLIC;
            case 2:
                return CommunityVisibilityState.PRIVATE;
            case 3:
                return CommunityVisibilityState.PRIVATE;
            default:
                return null;
        }
    }
}
