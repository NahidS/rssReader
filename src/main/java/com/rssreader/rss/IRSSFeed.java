package com.rssreader.rss;

import java.util.Date;

public interface IRSSFeed {
   public String getTitle();
   public String getDescription();
   public Date getPublishedDate();
   public String getURL();
}
