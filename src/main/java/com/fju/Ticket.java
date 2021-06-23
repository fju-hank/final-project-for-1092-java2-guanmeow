package com.fju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Ticket {
    String name;
    int cost ;

    public Ticket(){
        this.name = name;
        this.cost = cost;

    }
    public void rule(){
        try {
            URL url = new URL("https://odws.hccg.gov.tw/001/Upload/25/OpenData/9059/392/f3a3b874-cbce-427c-9223-c667fe0b6ff6.json");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
