package com.einfochips.Test.Model;

public class FoodMenu {
private long Id;
private String desc;
private String image;
private int price;
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public FoodMenu(long id, String desc, String image, int price) {
	super();
	Id = id;
	this.desc = desc;
	this.image = image;
	this.price = price;
}
public FoodMenu() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "FoodMenu [Id=" + Id + ", desc=" + desc + ", image=" + image + ", price=" + price + "]";
}


}
