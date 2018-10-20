//** Step 3 **\\

import java.util.Date;

public abstract class Product implements Item {

    public int serialNumber;
    public String manufacturer;
    public Date manufacturedOn;
    public String name;

    public int currentProductionNumber =+ 1; // I don't think this is right... (step 3 increment)

    @Override
    public void setProductionNumber(int productnum) {

    }

    @Override
    public void setName(String name) {

    }

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void getName() {

    }

    @Override
    public Date getManufactureDate() {
        return null;
    }

    @Override
    public int getSerialNumber() {
        return 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", manufacturer='" + manufacturer + '\'' +
                "serialNumber=" + serialNumber +
                ", manufacturedOn=" + manufacturedOn +
                ", name='" + name + '\'' +
                '}';
    }
}
