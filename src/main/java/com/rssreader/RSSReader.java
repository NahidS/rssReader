package com.rssreader;

import java.util.ArrayList;
import java.util.List;

import com.rssreader.rss.HTMLRSSPrinter;
import com.rssreader.rss.RSSReaderJSONImpl;
import com.rssreader.rss.RedditRSSFeed;

public class RSSReader {
   public static void main(String[] args) {
      // TODO: Use rss package classes/interfaces to do what you need here
      List<RedditRSSFeed> feeds = new ArrayList<RedditRSSFeed>();
      String source = "https://www.reddit.com/r/aww.json";
      RSSReaderJSONImpl reader = new RSSReaderJSONImpl();
      HTMLRSSPrinter printer = new HTMLRSSPrinter();
      feeds = reader.read(source);
      printer.print(feeds);
   }
}
