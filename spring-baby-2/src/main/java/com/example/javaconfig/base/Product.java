package com.example.javaconfig.base;

public class Product {
    private String productId;
    private String productDescription;

    public Product(String productId, String productDescription) {
        this.productId = productId;
        this.productDescription = productDescription;
    }
    public Product() {}

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
