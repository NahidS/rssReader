package com.rssreader.objects;

public class Page {
   public String title;
   public String postedBy;
   public String upvotes;
   public String comments;
   /**
    * @return the title
    */
   public String getTitle() {
      return title;
   }
   /**
    * @param title the title to set
    */
   public void setTitle(String title) {
      this.title = title;
   }
   /**
    * @return the postedBy
    */
   public String getPostedBy() {
      return postedBy;
   }
   /**
    * @param postedBy the postedBy to set
    */
   public void setPostedBy(String postedBy) {
      this.postedBy = postedBy;
   }
   /**
    * @return the upvotes
    */
   public String getUpvotes() {
      return upvotes;
   }
   /**
    * @param upvotes the upvotes to set
    */
   public void setUpvotes(String upvotes) {
      this.upvotes = upvotes;
   }
   /**
    * @return the comments
    */
   public String getComments() {
      return comments;
   }
   /**
    * @param comments the comments to set
    */
   public void setComments(String comments) {
      this.comments = comments;
   }
}
