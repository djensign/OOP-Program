//**Step 11**\\

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screen;
  MonitorType monitor_type;

  public MoviePlayer(String name, Screen screen, MonitorType monitor_type) {
    super(name);
    this.screen = screen;
    this.monitor_type = monitor_type;
  }

  //Methods copied from AudioPlayer
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
    return super.toString() + '\n' +
        "Screen : " + screen + '\n' +
        "Monitor Type : " + monitor_type;
  }
}
