package java.com.infoshareacademy.cleancode;

import java.math.BigDecimal;

public class ProductData {

public String getName() {
        return name;
    }
    private BigDecimal price;
            private BigDecimal vat;

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
this.id = id;
    }

    private String name;
        private int id;

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
