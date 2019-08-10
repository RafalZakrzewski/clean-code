package java.com.infoshareacademy.composition;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;
    private BigDecimal vat;

    public Product(BigDecimal price, BigDecimal vat) {
        this.price = price;
        this.vat = vat;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public BigDecimal getPriceWithoutVat() {
        return getPriceWithVat().add(vat);
    }

    public BigDecimal getPriceWithVat() {
        return price.add(vat);
    }

}
