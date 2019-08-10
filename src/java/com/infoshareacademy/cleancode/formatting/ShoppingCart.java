package java.com.infoshareacademy.cleancode.formatting;

import java.com.infoshareacademy.codereview.Client;
import java.math.BigDecimal;
import java.util.Iterator;

public class ShoppingCart {
    public ShoppingCart(Client client) {
this.client = client;
    }

public Client getClient() {
    return client;
}

    public Product getProduct(){
    return product;
    }

    public void addProduct(Product product)
    {
        this.product = product;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BigDecimal getTotalPrice(boolean showVat) {
        BigDecimal totalPrice = BigDecimal.valueOf(Double.valueOf(new java.text.DecimalFormat("#.##").format(product.getPrice().add(product.getVat()))));
        return totalPrice;
    }

    private Product product;
    private Client client;
}
