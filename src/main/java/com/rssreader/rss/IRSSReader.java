package com.rssreader.rss;

import java.util.List;

public interface IRSSReader<T extends IRSSFeed> {
   public List<T> read(String source);
}
