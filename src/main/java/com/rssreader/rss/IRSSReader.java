package com.rssreader.rss;

import java.util.List;

public interface IRSSReader {
   public List<IRSSFeed> read(String source);
}
