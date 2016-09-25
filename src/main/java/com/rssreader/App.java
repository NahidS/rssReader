package com.rssreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rssreader.objects.Page;

public class App {
   /**
    * Convert url to JSON object
    * @param String 
    * @return JSON object
    * @throws IOException
    * @throws JSONException
    */
   public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
      InputStream is = new URL(url).openStream();
      try {
         BufferedReader rd = new BufferedReader(new InputStreamReader
               (is, Charset.forName("UTF-8")));
         String jsonText = readAll(rd);
         JSONObject json = new JSONObject(jsonText);
         return json;
      } finally {
         is.close();
      }
   }
   private static String readAll(Reader rd) throws IOException {
      StringBuilder sb = new StringBuilder();
      int cp;
      while ((cp = rd.read()) != -1) {
         sb.append((char) cp);
       }
       return sb.toString();
   }
   /**
    * Convert JSON string to Java object
    * @param String 
    * @return Page
    */
   public static Page convertJsonToObject(String json) {
      Gson gson = new GsonBuilder().create();
      Page page = gson.fromJson(json, Page.class);
      return page;
   }
   public static void main(String [] args) throws IOException, JSONException {
      JSONObject jsonObj = readJsonFromUrl("https://www.reddit.com/r/aww.json");
      Page page = convertJsonToObject(jsonObj.toString());
      System.out.println("title: " + page.getTitle());
      
   }
}

