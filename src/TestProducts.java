import java.util.Date;
import java.util.List;

/**
 * Created by mahajani on 7/23/2017.
 */
public class TestProducts {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        List<Product> productList = inventory.currentInventory();
//        for(int i = 0 ; i < productList.size() ; i++ ) {
//            System.out.println(productList.get(i));
//        }
        Product product =  new Product(1006, "Comb", "Vega", new Date(2012,7,07), 0);
        inventory.addProduct(product);
        for(int i = 0 ; i < productList.size() ; i++ ) {
            System.out.println(productList.get(i));
        }

        System.out.println("---------------------");

        //search functionality
        System.out.println(inventory.searchDetails("Hair Dryer"));

        System.out.println("---------------------");

        //delete product
        inventory.deleteProduct(product);
        for(int i = 0 ; i < productList.size() ; i++ ) {
            System.out.println(productList.get(i));
        }

    }

}
