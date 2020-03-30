package com.java.swing.util;

import com.java.swing.product.Product;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static List<Product> getProductData() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Komputer", 3000));
        products.add(new Product("Telefon", 1500));
        products.add(new Product("Kosiarka", 800));

        return products;
    }
}
