package service;

import model.Product;
import utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    String path = "data/products.csv";

    public ProductService() {
        getItem();
    }

    public List<Product> getItem() {
        List<Product> newProduct = new ArrayList<>();
        List<String> records = CSVUtils.read(path);
        for (String record : records) {
            newProduct.add(Product.pareProduct(record));
        }
        return newProduct;
    }

    public void add(Product newProduct) {
        List<Product> productList = getItem();
        productList.add(newProduct);
        CSVUtils.write(path, productList);
    }

    public void remove(Product newProduct) {
        List<Product> productList = getItem();
        productList.removeIf(product -> product.getProductId() == newProduct.getProductId());
        CSVUtils.write(path, productList);
    }

    public boolean getProductById(long id) {
        List<Product> productList = getItem();
        for (Product product : productList) {
            if (product.getProductId() == id) {
                return true;
            }
        }
        return false;
    }
    public Product getProductByIdd(long id) {
        List<Product> productList = getItem();
        for (Product product : productList) {
            if (product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }
}