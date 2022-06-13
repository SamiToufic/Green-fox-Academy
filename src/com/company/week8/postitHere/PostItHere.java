//Create a PostIt class that has
//        a backgroundColor
//        a text on it
//        a textColor
//        Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"


package postitHere;


  public class PostItHere {
    String backgroundColor;
    String text;
    String textColor;



    public PostItHere(String text, String backgroundColor, String textColor) {
      this.text = text;
      this.backgroundColor = backgroundColor;
      this.textColor = textColor;
  }

    public PostItHere() {

    }
  }
