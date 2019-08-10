package java.com.infoshareacademy.cleancode.rafalzakrzewski;

import java.com.infoshareacademy.codereview.Client;
import java.math.BigDecimal;

public class ShoppingCartCreate {
    private ProductData products;
    private Client client;

    public ShoppingCartCreate(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public ProductData getprddata() {
        return products; //return here a state of shipping
    }

    public void addProduct(String name) {
        client.setName(name);
    }

    public BigDecimal getTotalPrice() {
        return BigDecimal.valueOf(
                Double.valueOf(
                        new java.text.DecimalFormat("#.##")
                                .format(products.getPrice().add(products.getVat()))));

    }

}
