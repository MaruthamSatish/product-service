package com.product.bean;

public class Product {
private String productName;
private int productId;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public Product(String productName, int productId) {
	super();
	this.productName = productName;
	this.productId = productId;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}
