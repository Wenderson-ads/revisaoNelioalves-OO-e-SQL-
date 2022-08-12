package entities;

public class Product {
	
	private int id;
	private String description;
	private String imagiUri;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImagiUri() {
		return imagiUri;
	}
	public void setImagiUri(String imagiUri) {
		this.imagiUri = imagiUri;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
