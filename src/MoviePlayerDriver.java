//**Step 12**\\

public class MoviePlayerDriver  {

  public static void testMoviePlayer() {
    MoviePlayer mov1 = new MoviePlayer("DBPOWER MK101", new Screen(" 720x480",
        40, 22),
        MonitorType.LCD);

    MoviePlayer mov2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768",
        40, 22),
        MonitorType.LED);

    System.out.println(mov1);
    System.out.println(mov2);

    mov1.next();

    mov1.play();

    mov1.previous();

    mov1.stop();
  }
}