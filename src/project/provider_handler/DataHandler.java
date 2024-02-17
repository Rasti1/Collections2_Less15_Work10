package project.provider_handler;

import project.entity.Product;

import java.util.Map;

public class DataHandler {

    public String getProduct(Map<Integer, Product> map,
                              String strId) {

        Integer id = Integer.parseInt(strId);
        if (map.containsKey(id)) {
            return "Product: id " + strId + ", " +
                    map.get(id).toString();
        } else return "No data!";
    }

    public void getOutput(String output) {

        System.out.println("\n>> " + output);

    }
}
