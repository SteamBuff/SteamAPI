# Library SteamAPI - this wrapper for Steam API, only web, for Java.



[![codecov](https://codecov.io/gh/SteamBuff/SteamAPI/branch/master/graph/badge.svg)](https://codecov.io/gh/SteamBuff/SteamAPI)
[![Build Status](https://travis-ci.org/SteamBuff/SteamAPI.svg?branch=master)](https://travis-ci.org/SteamBuff/SteamAPI)


## Example

```java
class SteamApiExample {
    
    public static void main(String[] args){
        SteamApi steamApi = SteamApi.getInstance("KEY");
        PlayerSummaries playerSummaries;
        try{ 
            playerSummaries =  steamApi.getSteamUserInterface().getPlayerSummaries(new SteamId(0,2)).get(0);
        }catch (SteamApiException exception){
            System.out.println("Some errors: " + exception.getMessage());
        }
       System.out.println("Result: "+playerSummaries.getDisplayName());
    }
}
```

## Usage in your project

### Maven 

```
<dependency>
    <groupId>org.steambuff</groupId>
    <artifactId>SteamAPI</artifactId>
    <version>0.4.0-beta</version>
</dependency>
```

### Gradle
```
compile 'org.steambuff:SteamAPI:0.4.0-beta'
```

[Another system](https://mvnrepository.com/artifact/org.steambuff/SteamAPI)

## Available method's
- [x] GetPlayerSummaries (v0002)
- [ ] GetNewsForApp (v0002)
- [ ] GetGlobalAchievementPercentagesForApp (v0002)
- [ ] GetGlobalStatsForGame (v0001)
- [ ] GetPlayerSummaries (v0002)
- [ ] GetFriendList (v0001)
- [ ] GetPlayerAchievements (v0001)
- [x] GetUserStatsForGame (v0002)
- [x] GetOwnedGames (v0001)
- [ ] GetRecentlyPlayedGames (v0001)
- [ ] IsPlayingSharedGame (v0001)
- [ ] GetSchemaForGame (v2)
- [x] GetPlayerBans (v1)
