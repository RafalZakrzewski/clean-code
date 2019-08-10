package java.com.infoshareacademy.cleancode.formatting;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;
    private BigDecimal vat;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }
}
