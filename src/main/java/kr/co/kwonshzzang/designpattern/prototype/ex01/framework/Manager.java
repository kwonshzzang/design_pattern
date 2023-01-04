package kr.co.kwonshzzang.designpattern.prototype.ex01.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = null;

    public Manager() {
        showcase = new HashMap<>();
    }

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String name) {
        Product p = showcase.get(name);
        return p.createClone();
    }
}
