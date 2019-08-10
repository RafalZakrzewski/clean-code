package java.com.infoshareacademy.cleancode.names;

import java.com.infoshareacademy.codereview.Client;

public class ShoppingCartController {
    private ProductData products;
    private Client client;

    public ShoppingCartController(Client client) {
        this.client = client;
    }

    public Client getBuyer() {
        return client;
    }

    public ProductData getprddata() {
        return products;
    }

    public void addProduct(String name) {
        client.setName(name);
    }
}
