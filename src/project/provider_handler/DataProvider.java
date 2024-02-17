package project.provider_handler;

import project.entity.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataProvider {

    public String getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput product's id for search: ");
        return scanner.nextLine().trim();
    }

    public Map<Integer, Product> getData() {

        Map<Integer, Product> map = new HashMap<>();

        map.put(52, new Product("TV", 100, 1500));
        map.put(21, new Product("Smartphone", 500, 600));
        map.put(10, new Product("Earphones", 200, 250));
        map.put(47, new Product("Smartwatches", 200, 400));

        return map;

    }
}
