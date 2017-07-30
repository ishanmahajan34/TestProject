import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by mahajani on 7/28/2017.
 */
public class ListDemo1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ISHAN","SACHIN","ARYAN", "MAHAJAN","ASNAS","MANGO");
        list.forEach((String str) -> {
            System.out.println(str.toLowerCase());
        });
    }

}
