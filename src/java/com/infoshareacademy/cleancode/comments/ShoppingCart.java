package java.com.infoshareacademy.cleancode.comments;

import java.com.infoshareacademy.codereview.Client;

/** Shopping cart */
public class ShoppingCart {
    private Product product;
    private Client client;

    /** Constructor - to create a */
    public ShoppingCart(Client client) {
        this.client = client;
    }

    //getter for clients
    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product; //return here a state of shipping
    }

    public void addProduct(Product product) {
        //TODO verify if product exits
        this.product = product;
    }

    public void setClient(Client client) {
        this.client = client; //Warning: clients should not change
    }

//    private Boolean isFreeShiping() {
//        return true;
//    }
}
