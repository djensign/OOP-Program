//** Step 5 **\\

public class AudioPlayer extends Product implements MultimediaControl {

    private String audioSpecification;
    private ItemType mediaType;

    public AudioPlayer(String name, String audioSpec){

      audioSpecification = audioSpec;
        mediaType = ItemType.Audio;

    }

    @Override
    public void play() {

      System.out.println("Playing");
    }

    @Override
    public void stop() {

      System.out.println("Stop");
    }

    @Override
    public void previous() {

      System.out.println("Previous");
    }

    @Override
    public void next() {

      System.out.println("Next");
    }


}
