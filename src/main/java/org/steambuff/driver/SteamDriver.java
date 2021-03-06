package org.steambuff.driver;

import org.steambuff.exception.SteamApiException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/**
 * The type Steam driver.
 */
public class SteamDriver implements DriverInterface {

    private boolean useHttp = true;

    @Override
    public String getData(String url, Params params, String method) throws SteamApiException {
        if (url == null) {
            throw new SteamApiException("Url is null.");
        }
        try {
            if (useHttp) {
                url = "https://" + url;
            } else {
                url = "http://" + url;
            }

            return process(url, params);
        } catch (IOException e) {
            throw new SteamApiException(e.getMessage());
        }
    }

    @Override
    public DriverInterface useHttps(boolean useHttps) {
        this.useHttp = useHttps;
        return this;
    }

    private String process(String url, Params params) throws IOException {
        String stringParams = "";
        if (params != null) {
            stringParams = "?" + params.toString();
        }
        URL steamUrl = new URL(url + stringParams);
        URLConnection steamConnection = steamUrl.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        steamConnection.getInputStream(),
                        Charset.forName("UTF-8")
                )
        );
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null)
            response.append(inputLine);
        in.close();
        return response.toString();
    }
}
