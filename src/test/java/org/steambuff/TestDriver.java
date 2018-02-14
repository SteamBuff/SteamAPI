package org.steambuff;

import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.Params;

public class TestDriver implements DriverInterface {
    @Override
    public String getData(String url, Params params, String method) {
        return "{\n" +
                "    \"response\": {\n" +
                "        \"players\": {\n" +
                "            \"player\": [\n" +
                "                {\n" +
                "                    \"steamid\": \"76561197960435530\",\n" +
                "                    \"communityvisibilitystate\": 3,\n" +
                "                    \"profilestate\": 1,\n" +
                "                    \"personaname\": \"Robin\",\n" +
                "                    \"lastlogoff\": 1518330913,\n" +
                "                    \"profileurl\": \"http://steamcommunity.com/id/robinwalker/\",\n" +
                "                    \"avatar\": \"https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/f1/f1dd60a188883caf82d0cbfccfe6aba0af1732d4.jpg\",\n" +
                "                    \"avatarmedium\": \"https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/f1/f1dd60a188883caf82d0cbfccfe6aba0af1732d4_medium.jpg\",\n" +
                "                    \"avatarfull\": \"https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/f1/f1dd60a188883caf82d0cbfccfe6aba0af1732d4_full.jpg\",\n" +
                "                    \"personastate\": 0,\n" +
                "                    \"realname\": \"Robin Walker\",\n" +
                "                    \"primaryclanid\": \"103582791429521412\",\n" +
                "                    \"timecreated\": 1063407589,\n" +
                "                    \"personastateflags\": 0,\n" +
                "                    \"loccountrycode\": \"US\",\n" +
                "                    \"locstatecode\": \"WA\",\n" +
                "                    \"loccityid\": 3961\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }
}
