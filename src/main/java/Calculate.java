import java.util.Scanner;

public class Calculate {
    static String productList="";
    static float finalPrice;
    void add(String productName, float productPrice){
        productList+=productName+"\n";
        finalPrice+=productPrice;
    }
}