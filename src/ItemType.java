//** Step 2 **\\

public enum ItemType {
  Audio("AU"),
  Video("VI"),
  AudioMobile("AM"),
  VideoMobile("VM");

  public final String code;

  ItemType(String code) {
    this.code = code;
  }

}
