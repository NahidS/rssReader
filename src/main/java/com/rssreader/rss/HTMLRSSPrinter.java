package com.rssreader.rss;

import java.util.List;

public class HTMLRSSPrinter implements IRSSPrinter {
   
   public void print(List<RedditRSSFeed> feeds) {
      for (RedditRSSFeed feedy : feeds) {
         System.out.println("feedy: " + feedy);
      }
   }
}
