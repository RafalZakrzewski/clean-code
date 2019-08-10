package java.com.infoshareacademy.cleancode.classes;

import java.com.infoshareacademy.codereview.Client;
import java.util.Iterator;

public class ShoppingCartCreate {
    private Product product;
    private Client client;

    private double getHandlingVAT() {
        // If no valid items in shoppingcart, freight is set to 0.0
        if (getValidEntries() == null || getValidEntries().size() == 0) {
            LOG.debug("OLDLOG " + Debug.STD_LEVEL_DEBUG + " " + THIS + ".getHandling: Handling set to zero. Original value = " + handling);
            handlingVAT = 0.0;
        }

        return handlingVAT;
    }

    private double getOrderSimBestPriceSubTotalVAT() {
        double total = 0;
        EntryData item = null;
        Iterator<EntryData> it = getValidEntriesIterator();
        while (it != null && it.hasNext()) {
            item = it.next();

            LOG.debug("OLDLOG " + Debug.STD_LEVEL_DEBUG + " " + THIS + ".getOrderSimBestPriceSubTotalVAT: item = " + item.toString());
            total += item.getTotalSimulateVAT();
        }
        LOG.debug("OLDLOG " + Debug.STD_LEVEL_DEBUG + " " + THIS + ".getOrderSimBestPriceSubTotalVAT: VAT = " + total);
        return total;
    }

    public double getOrderSimGrandTotalVAT() {
        return getHandlingVAT() + getOrderSimBestPriceSubTotalVAT();

    }

    // priwatne na górze
    // duża klasa
    // wiele odpowiedzialności
//    organizacja klas (publiczne, prywatne)
//    powinny być małe
//    pojedyncza odpowiedzialność
//    niewiele zmiennych instancyjnych
//    zachowanie dużej spójności


    public ShoppingCartCreate(Client client) {
        this.client = client;
    }

    public Client getClient() {
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

    public String
}
