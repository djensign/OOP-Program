//** Step 6 **\\

public class AudioPlayerDriver {

  public static void testAudioPlayer() {

    AudioPlayer playerTest1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer playerTest2 = new AudioPlayer("Walkman", "WAV");

    playerTest1.play(); //Playing
    playerTest1.stop(); //Stopping
    playerTest1.next(); //Next
    playerTest1.previous(); //Previous

    System.out.println(playerTest1); //print for ipod mini/mp3
    System.out.println(playerTest2); //print for walkman/wav
  }
}
