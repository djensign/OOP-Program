//** Step 2 **\\

public enum ItemType {
  AUDIO("AU"),
  VIDEO("VI"),
  AUDIO_MOBILE("AM"),
  VIDEO_MOBILE("VM");

  public final String code;

  ItemType(String code) {

    this.code = code;
  }

}
