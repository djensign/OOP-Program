//** Step 2 **\\

public enum ItemType {
  Audio("AU"),
  Video("VI"),
  Audio_Mobile("AM"),
  Video_Mobile("VM");

  public final String code;

  ItemType(String code) {

    this.code = code;
  }

}
