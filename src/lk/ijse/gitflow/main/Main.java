package lk.ijse.gitflow.main;

import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.2.0
 **/
public class Main {
    public static void main(String[] args) {
        ArrayList<String> allCustomerNames = new ArrayList<>();
        allCustomerNames.add("Kasun");
        allCustomerNames.add("Sura-Boy");
        allCustomerNames.add("Yase-Boy");
        allCustomerNames.add("Thamalsha");

        for (String allCustomerName : allCustomerNames) {
            System.out.println(allCustomerName);
        }
    }
}
