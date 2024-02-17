package project;

import project.entity.Product;
import project.outputer.Outputer;
import project.provider_handler.DataHandler;
import project.provider_handler.DataProvider;

import java.util.Map;

public class App {

    public static void main(String[] args) {

        Outputer output = new Outputer();
        DataProvider provider = new DataProvider();
        DataHandler handler = new DataHandler();

        Map<Integer, Product> data = provider.getData();
        output.getInfo(data);

        String product = handler.getProduct(data, provider.getId());
        handler.getOutput(product);

    }
}
