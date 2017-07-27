import java.util.Date;

/**
 * Created by mahajani on 7/23/2017.
 */
public class Product {

    private int productId;
    private String productName;
    private String manufacturer;
    private Date dateOfManufacturing;
    private int warrentyPeriod;

    public Product(int productId, String productName, String manufacturer, Date dateOfManufacturing, int warrentyPeriod) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.dateOfManufacturing = dateOfManufacturing;
        this.warrentyPeriod = warrentyPeriod;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", dateOfManufacturing=" + dateOfManufacturing +
                ", warrentyPeriod=" + warrentyPeriod +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setDateOfManufacturing(Date dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public int getWarrentyPeriod() {
        return warrentyPeriod;
    }

    public void setWarrentyPeriod(int warrentyPeriod) {
        this.warrentyPeriod = warrentyPeriod;
    }
}
