package sort;

import model.Product;

import java.util.Comparator;

public class PriceSortDES implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPriceProduct() > o2.getPriceProduct()) {
            return -1;
        } else if (o1.getPriceProduct() == o2.getPriceProduct()) {
            return 0;
        } else {
            return 1;
        }
    }
}

