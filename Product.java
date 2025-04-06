package project3;

public class Product {

	private String productId;
	private String category;
	private String brand;
	private double price;
	
	Product(String productId,String category , String brand , double price)
	{
		this.productId = productId;
		this.category = category;
		this.brand = brand;
		this.price = price;
		
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	//getters
	public String getProductId(){
		return this.productId;
	}
	public String getCategory(){
		return this.category;
	}
	public String getBrand(){
		return this.brand;
	}
	public double getPrice(){
		return this.price ;
	}
	
	//setters
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "[productId="+productId+",category=" + category + ",brand=" + brand + ",price=" + price;
	}

}
