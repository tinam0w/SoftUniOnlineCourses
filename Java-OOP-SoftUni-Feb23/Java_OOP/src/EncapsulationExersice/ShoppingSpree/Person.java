package EncapsulationExersice.ShoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product){
        if (product.getCost() > money){
            throw new IllegalStateException(this.getName() +
                    " can't afford " + product.getName());
        }

        products.add(product);
        money -= product.getCost();
    }

    public List<Product> getProducts(){
        return Collections.unmodifiableList(products);
    }

    private void setName(String name) {
        Validations.validateName(name);
        this.name = name;
    }

    private void setMoney(double money) {
        Validations.validateMoney(money);
        this.money = money;
    }

    public String getName() {
        return name;
    }
}
