package model;

import java.util.PrimitiveIterator;

public class Product {
    private long productId;
    private String nameProduct;
    private double priceProduct;
    private int quantityProduct;
    private String description;

    public Product(long productId, String nameProduct, double priceProduct, int quantityProduct, String description) {
        this.productId = productId;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.quantityProduct = quantityProduct;
        this.description = description;
    }
    public Product(){}
    public static Product pareProduct(String record){
        Product product = new Product();
        String[] records = record.split(",");
        product.productId = Long.parseLong(records[0]);
        product.nameProduct = records[1];
        product.priceProduct = Double.parseDouble(records[2]);
        product.quantityProduct = Integer.parseInt(records[3]);
        product.description = records[4];
        return product;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return productId + ","
                + nameProduct+","
                + priceProduct +","
                + quantityProduct +","
                + description;
    }
}
