package com.internousdev.yataberyouhin.dto;

import java.util.Date;

public class ItemDTO {
private int Id;
private int productId;
private String productName;
private String productNameKana;
private String productDescription;
private int categoryId;
private int price;
private String imageFilePath;
private String imageFileName;
private Date releaseDate;
private String releaseCompany;
private short status;
private Date registerDate;
private Date updateDate;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductNameKana() {
	return productNameKana;
}
public void setProductNameKana(String productNameKana) {
	this.productNameKana = productNameKana;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getImageFilePath() {
	return imageFilePath;
}
public void setImageFilePath(String imageFilePath) {
	this.imageFilePath = imageFilePath;
}
public String getImageFileName() {
	return imageFileName;
}
public void setImageFileName(String imageFileName) {
	this.imageFileName = imageFileName;
}
public Date getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(Date releaseDate) {
	this.releaseDate = releaseDate;
}
public String getReleaseCompany() {
	return releaseCompany;
}
public void setReleaseCompany(String releaseCompany) {
	this.releaseCompany = releaseCompany;
}
public short getStatus() {
	return status;
}
public void setStatus(short status) {
	this.status = status;
}
public Date getRegisterDate() {
	return registerDate;
}
public void setRegisterDate(Date registerDate) {
	this.registerDate = registerDate;
}
public Date getUpdateDate() {
	return updateDate;
}
public void setUpdateDate(Date updateDate) {
	this.updateDate = updateDate;
}




}
