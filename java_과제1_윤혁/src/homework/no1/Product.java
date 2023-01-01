package homework.no1;

import java.util.Objects;

public class Product {
	
	private String brand;
	private String productUID;
	private String color;
	private int price;
	
	Product(String brand, String productUID, String color, int price){
		this.brand = brand;
		this.productUID = productUID;
		this.color = color;
		this.price = price;
	}

	 
		


	public String getBrand() {
		return brand;
	}





	public void setBrand(String brand) {
		this.brand = brand;
	}





	public String getProductUID() {
		return productUID;
	}





	public void setProductUID(String productUID) {
		this.productUID = productUID;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(productUID);
	}





	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Product))
			return false;
		
		Product product = (Product)obj;
		return this.productUID.equals(product.productUID); 
	}



	@Override
	public String toString() {
		return "product [brand=" + brand + ", productUID=" + productUID + ", color=" + color + ", price=" + price + "]";
	}

}
