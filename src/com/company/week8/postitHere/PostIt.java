package postitHere;

public class PostIt {


  public static void main(String[] args) {
    PostItHere Idea1 = new PostItHere();
    Idea1.backgroundColor = "Orange";
    Idea1.text = "Idea1";
    Idea1.textColor = "blue";
    PostItHere awesome = new PostItHere("Awesome", "pink", "black");


    PostItHere superb = new PostItHere("Superb!", "yellow", "green");
  }
}
