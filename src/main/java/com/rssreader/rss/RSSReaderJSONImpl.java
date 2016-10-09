package com.rssreader.rss;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class RSSReaderJSONImpl implements IRSSReader<RedditRSSFeed> {
   
   public List<RedditRSSFeed> read(String source) {
      List<RedditRSSFeed> feeds = new ArrayList<RedditRSSFeed>();
      Gson gson = new Gson(); 
      try {
         String json = readUrl(source);
         for (RedditRSSFeed feedy : feeds) {
            feedy = gson.fromJson(json, RedditRSSFeed.class);
            feeds.add(feedy);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      return feeds;
   }
   
   private static String readUrl(String urlString) throws Exception {
      BufferedReader reader = null;
      try {
         URL url = new URL(urlString);
         reader = new BufferedReader(new InputStreamReader(url.openStream()));
         StringBuffer buffer = new StringBuffer();
         int read;
         char[] chars = new char[1024];
         while ((read = reader.read(chars)) != -1)
            buffer.append(chars, 0, read); 

         return buffer.toString();
      } finally {
         if (reader != null)
            reader.close();
      }
   }
}
