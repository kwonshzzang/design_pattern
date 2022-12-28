package kr.co.kwonshzzang.designpattern.factorymethod.ex01.idcard;

import kr.co.kwonshzzang.designpattern.factorymethod.ex01.framework.Factory;
import kr.co.kwonshzzang.designpattern.factorymethod.ex01.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory  {
    private Map<Integer, String> database;
    public static int serial = 100;

    public IDCardFactory() {
        database = new HashMap<>();
    }

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(card.getSerial(), card.getOwner());
    }

    public Map<Integer, String> getDatabase() {
        return database;
    }
}
