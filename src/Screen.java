//**Step 9**\\

public class Screen implements ScreenSpec {

  String resolution;

  int refreshrate;

  int responsetime;

  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshrate;
  }

  @Override
  public int getResponseTime() {
    return this.responsetime;
  }

  @Override
  public String toString() {
    return
        "Resolution : " + resolution + '\n' +
        "Refresh rate : " + refreshrate + '\n' +
        "Response time : " + responsetime;
  }
}
