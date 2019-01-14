# Library SteamAPI - this wrapper for Steam API, only web, for Java.



[![codecov](https://codecov.io/gh/SteamBuff/SteamAPI/branch/master/graph/badge.svg)](https://codecov.io/gh/SteamBuff/SteamAPI)
[![Build Status](https://travis-ci.org/SteamBuff/SteamAPI.svg?branch=master)](https://travis-ci.org/SteamBuff/SteamAPI)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.steambuff/SteamAPI/badge.svg?style=flat)](https://maven-badges.herokuapp.com/maven-central/org.steambuff/SteamAPI/)

## Example

```java
class SteamApiExample {
    
    public static void main(String[] args) throws SteamApiException {
        SteamApi steamApi = SteamApi.getInstance("KEY");
        SteamId steamId = new SteamId(76561198201241926);
        PlayerSummaries playerSummaries = steamApiSemaphore.getSteamUserInterface()
                                                           .getPlayerSummaries(suspectSteamId)
                                                           .orElseThrow();
        System.out.println("Result: " + playerSummaries.getDisplayName());
    }
}
```

## Usage in your project

### Maven 

```xml
<dependency>
    <groupId>org.steambuff</groupId>
    <artifactId>SteamAPI</artifactId>
    <version>{REPLACE_TO_VERSION}</version>
</dependency>
```

### Gradle
```groovy
compile 'org.steambuff:SteamAPI:{REPLACE_TO_VERSION}'
```

[Another system](https://mvnrepository.com/artifact/org.steambuff/SteamAPI)

[JavaDoc](https://steambuff.github.io/SteamAPI/index.html?overview-summary.html)

## Available method's
- [x] GetPlayerSummaries (v0002)
- [ ] GetNewsForApp (v0002)
- [ ] GetGlobalAchievementPercentagesForApp (v0002)
- [ ] GetGlobalStatsForGame (v0001)
- [ ] GetFriendList (v0001)
- [ ] GetPlayerAchievements (v0001)
- [x] GetUserStatsForGame (v0002)
- [x] GetOwnedGames (v0001)
- [ ] GetRecentlyPlayedGames (v0001)
- [ ] IsPlayingSharedGame (v0001)
- [x] GetSchemaForGame (v2)
- [x] GetPlayerBans (v1)

## Additional methods

- getSteamIdByPage (Get SteamId by profile user)
- getSteamIdByLogin (Get SteamId by profile login)
