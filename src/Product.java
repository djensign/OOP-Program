//** Step 3 **\\

import java.util.Date;

public abstract class Product implements Item {

  private int serialNumber;
  private String manufacturer = "OracleProduction";
  private Date manufacturedOn;
  private String name;

  private static int currentProductionNumber = 0;


  // Constructor for step 3
  public Product(String name) {
    this.name = name;
    manufacturedOn = new Date();
    serialNumber = currentProductionNumber++;
  }

  @Override // Method for setting the production number/serial number
  public void setProductionNumber(int productnum) {

    currentProductionNumber = productnum;
  }

  @Override // Method for setting the name
  public void setName(String name) {

    this.name = name;
  }

  @Override // Method for returning the name result
  public String getName() {

    return name;
  }

  @Override // Method for getting date.
  public Date getManufactureDate() {

    return manufacturedOn;
  }

  @Override // Method for returning the serial number
  public int getSerialNumber() {

    return serialNumber;
  }


  //toString statement for end of step 3
  @Override
  public String toString() {
    return
        "Manufacturer : " + manufacturer + "\n" +
        "Serial Number : " + serialNumber + "\n" +
        "Date : " + manufacturedOn + "\n" +
        "Name : " + name;
  }
}
