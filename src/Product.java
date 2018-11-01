//** Step 3 **\\

import java.util.Date;

public abstract class Product implements Item {

  private int serialNumber;
  private Date manufacturedOn;
  private String name;

  private int currentProductionNumber = 1;


  // Constructor for step 3
  public Product(String name) {
    this.name = name;
  }

  @Override // Method for setting the production number/serial number
  public void setProductionNumber(int productnum) {
    System.out.println(productnum);
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
    return manufacturedOn = new Date();
  }

  @Override // Method for returning the serial number
  public int getSerialNumber() {
    return serialNumber;
  }


  //toString statement for end of step 3
  @Override
  public String toString() {
    return "Product{" +
        "serialNumber=" + serialNumber +
        ", manufacturer='" + manufacturer + '\'' +
        ", manufacturedOn=" + manufacturedOn +
        ", name='" + name + '\'' +
        '}';
  }
}
