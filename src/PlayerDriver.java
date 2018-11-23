//**Step 13**\\

public class PlayerDriver implements MultimediaControl {

  public static void testPlayer() {
    PlayerDriver pdTest = new PlayerDriver();

    pdTest.next();

    pdTest.play();

    pdTest.previous();

    pdTest.stop();
  }

  @Override
  public void next() {
    System.out.println("Next movie");
  }

  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }



}
