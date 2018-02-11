# Library SteamAPI 
## this wrapper for Steam API, only web, for Java.


## Status
> Planning status


[![Coverage Status](https://coveralls.io/repos/github/SteamBuff/SteamAPI/badge.svg?branch=master)](https://coveralls.io/github/SteamBuff/SteamAPI?branch=master)
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
            System.out.println("Some errors: "+exception.getMessage());
        }
       System.out.println("Result: "+playerSummaries.getDisplayName());
    }
}
```