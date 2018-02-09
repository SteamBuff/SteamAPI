

import driver.DriverInterface;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SteamApiTest {

    @Test
    void getPlayerServiceInterface() {
    }

    @Test
    void test(){

    }
}

class SpecialDriver implements DriverInterface{

    @Override
    public String getData(String url, Map<String, String> params, String method) {
        return null;
    }
}