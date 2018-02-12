package org.steambuff.driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SteamDriver implements DriverInterface{
    @Override
    public String getData(String url, Params params, String method) {
        try {
            return process(url,params);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  "";
    }

    private String process(String url, Params params) throws IOException {
        URL yahoo = new URL(url+"?"+paramsToString(params));
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null)
            response.append(inputLine);
        in.close();
        return response.toString();
    }

    private String paramsToString(Params params){
        StringBuffer buffer = new StringBuffer();
        params.forEach(data->{
            buffer.append(data.getKey()).append("=").append(data.getValue()).append("&");
        });
        return buffer.deleteCharAt(buffer.length()-1).toString();
    }
}
