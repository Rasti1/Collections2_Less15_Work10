package project.outputer;

import project.entity.Product;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Outputer {

    public void getInfo(Map<Integer,Product>map){

        System.out.println("List of products:\n");

        AtomicInteger counter = new AtomicInteger(0);
        map.forEach((id, product) ->
                System.out.println(counter.incrementAndGet() +
                        ") " + id + ", " + product));

    }
}
