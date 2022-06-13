package blogPost;


public class BlogPostMain {
  public static void main(String[] args) {
    BlogPost entry = new BlogPost();

    entry.authorName = "John Doe";
    entry.title = "Lorem Ipsum";
    entry.text = "Lorem ipsum dolor sit amet.";
    entry.PublicationDate = "2000.05.04.";

    BlogPost entry2 = new BlogPost();
    entry2.authorName = "Tim Urban";
    entry2.title = "Wait but why";
    entry2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    entry2.PublicationDate = "2010.10.10.";
  }
}
