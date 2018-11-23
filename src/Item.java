//** Step 1 **\\

import java.util.Date;

public interface Item {
    String manufacturer = "OracleProduction";

    void setProductionNumber(int productnum);

    void setName(String name);

    String getName();

    Date getManufactureDate();

    int getSerialNumber();

    int compareTo(Product pL);
}
