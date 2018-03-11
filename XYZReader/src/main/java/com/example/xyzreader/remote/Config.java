package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static URL BASE_URL;
    private static String TAG = Config.class.toString();

    public static URL getBaseUrl() throws Exception {
        if (BASE_URL == null) {
            URL url = null;
            try {
                url = new URL("https://go.udacity.com/xyz-reader-json");
            } catch (MalformedURLException ignored) {
                throw new Exception("Ups, something went wrong");
            }
            BASE_URL = url;
        }
        return BASE_URL;
    }
}
