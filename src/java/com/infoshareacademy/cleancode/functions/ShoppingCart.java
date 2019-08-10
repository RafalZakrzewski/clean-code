package java.com.infoshareacademy.cleancode.functions;

import java.com.infoshareacademy.codereview.Client;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
    private Product product;
    private Client client;
    private Boolean empty;

    public ShoppingCart(Client client) {
        this.client = client;
    }

    public Client client() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public void addProduct(Product product) {
        this.product = product;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Boolean getEmpty() {
        return empty;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public List<Product> getItemsAll(String filename, String containsString, Boolean active) {
        if (active) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                return reader.lines()
                        .map(line -> line.split(";"))
                        .map(line -> {
                            Product product = new Product();
                            product.setName(line[0]);
                            product.setId(line[1]);
                            return product;
                        })
                        .filter(account -> account
                                .getName()
                                .contains(containsString))
                        .collect(Collectors.toList());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        else {
            return null;
        }
    }
}
