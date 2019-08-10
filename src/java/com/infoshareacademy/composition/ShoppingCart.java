package java.com.infoshareacademy.composition;

import java.math.BigDecimal;

public class ShoppingCart {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.valueOf(Double.valueOf(new java.text.DecimalFormat("#.##").format(product.getPrice().add(product.getVat()))));
        return totalPrice;
    }

    public BigDecimal getSubTotalPrice() { // funkcja potrzebna w przyszłości
        return product.getPriceWithoutVat().multiply(new BigDecimal(1.2));
    }
}
