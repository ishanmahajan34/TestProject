import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mahajani on 7/23/2017.
 */
public class Inventory {

    List<Product> productList;

    Inventory() {
        productList = new ArrayList<Product>();
    }

    public List<Product> currentInventory() {
        Product product1 =  new Product(1001, "Hair Dryer", "Vega", new Date(2000,7,07), 2);
        Product product2 =  new Product(1002, "Shampoo", "Dove", new Date(2017,8,07), 0);
        Product product3 =  new Product(1003, "Conditioner", "Dove", new Date(2017,8,07), 0);
        Product product4 =  new Product(1004, "Dye", "Garnier", new Date(2017,8,07), 0);
        Product product5 =  new Product(1005, "Straightner", "Vega", new Date(2010,7,07), 1);

        productList = new ArrayList<Product>();

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        return productList;

    }

    public List<Product> addProduct(Product product) {
        productList.add(product);
        return productList;
    }

    public Product searchDetails(String productName) {
        for(int i = 0 ; i < productList.size() ; i++ ) {
            if(productList.get(i).getProductName().equals(productName)) {
                return productList.get(i);
            }
        }
        return null;
    }

    public List<Product> deleteProduct(Product product) {
       for(int i = 0 ; i < productList.size() ; i++ ) {
            if(productList.get(i).equals(product)) {
                productList.remove(i);
            }
        }
        return productList;
    }

}
