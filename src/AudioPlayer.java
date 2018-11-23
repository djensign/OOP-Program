//** Step 5 **\\

public class AudioPlayer extends Product implements MultimediaControl {

    private String audioSpecification;
    private ItemType mediaType;

    public AudioPlayer(String name, String audioSpec){
      super(name);
      audioSpecification = audioSpec;
      mediaType = ItemType.AUDIO;
    } //this will display step 6 results

    @Override
    public void play() {

      System.out.println("Playing");
    }

    @Override
    public void stop() {

      System.out.println("Stopping");
    }

    @Override
    public void previous() {

      System.out.println("Previous");
    }

    @Override
    public void next() {

      System.out.println("Next");
    }

  @Override
  public String toString() {
    return
        super.toString() + '\n' +
        "Audio Spec : " + audioSpecification + '\n' +
        "Type : " + mediaType;
  }
}
