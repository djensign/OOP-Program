//** Step 1 **\\

import java.util.Date;

public interface Item {
    public final String manufacturer = "OracleProduction";
    public void setProductionNumber(int productnum);
    public void setName(String name);
    public String getName();
    public Date getManufactureDate();
    public int getSerialNumber();
}
