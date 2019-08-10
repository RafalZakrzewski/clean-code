package java.com.infoshareacademy.cleancode.rafalzakrzewski;

import java.com.infoshareacademy.codereview.Client;
import java.math.BigDecimal;

/** Shopping cart create */
public class ShoppingCartCreate {
    private ProductData products;
    private Client client;

    /** Constructor */
    public ShoppingCartCreate(Client client) {
        this.client = client;
    }

    public Client getBuyer() {
        return client;
    }

    public ProductData getprddata() {
        return products; //return here a state of shipping
    }

    //getter for clients
    public void addProduct(String name) {
        client.setName(name);
    }

//    private Boolean isFreeShiping() {
//        return true;
//    }

    public BigDecimal getTotalPrice(boolean showVat) {
        BigDecimal totalPrice = BigDecimal.valueOf(Double.valueOf(new java.text.DecimalFormat("#.##").format(products.getPrice().add(products.getVat()))));
        return totalPrice;
    }

}
