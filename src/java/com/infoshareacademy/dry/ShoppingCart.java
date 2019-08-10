package java.com.infoshareacademy.dry;

import java.com.infoshareacademy.codereview.Client;
import java.math.BigDecimal;

public class ShoppingCart {
    private Product product;
    private Client client;

    public ShoppingCart(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public Product getProducts() {
        return product;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setClient(String name) {
        client.setName(name);
    }

    public BigDecimal getTotalPrice(boolean showVat) {
        BigDecimal totalPrice = BigDecimal.valueOf(Double.valueOf(new java.text.DecimalFormat("#.##").format(product.getPrice().add(product.getVat()))));
        return totalPrice;
    }
}
