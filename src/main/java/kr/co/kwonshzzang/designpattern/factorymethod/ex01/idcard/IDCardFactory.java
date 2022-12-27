package kr.co.kwonshzzang.designpattern.factorymethod.ex01.idcard;

import kr.co.kwonshzzang.designpattern.factorymethod.ex01.framework.Factory;
import kr.co.kwonshzzang.designpattern.factorymethod.ex01.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory  {
    private List<String> owners;

    public IDCardFactory() {
        owners = new ArrayList<>();
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
