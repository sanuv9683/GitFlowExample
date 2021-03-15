package lk.ijse.gitflow.main;

import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.2.1
 **/
public class Main {
    public static void main(String[] args) {
        String title="Customer Form";
        ArrayList<String> allCustomerNames = new ArrayList<>();
        allCustomerNames.add("Sanu-Boy");
        allCustomerNames.add("Sura-Boy");
        allCustomerNames.add("Yase-Boy");
        allCustomerNames.add("Thamala");

        for (String allCustomerName : allCustomerNames) {
            System.out.println(allCustomerName);
        }
    }
}
