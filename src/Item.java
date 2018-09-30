import java.util.Date;

public interface Item { //**Step 1**\\
    public final String manufacturer = "OracleProduction";
    public void setProductionNumber(int productnum);
    public void setName(String name);
    public void getName();
    public Date getManufactureDate();
    public int getSerialNumber();
}
