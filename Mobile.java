package project3;

public class Mobile extends Product {

	private String model;
	private int storage;
	private int ram;
	private String camera;
	
	public Mobile(String productId , String category , String brand , double price,
			String model, int storage, int ram, String camera)
	{
		super(productId , category , brand, price);
		
		this.camera = camera;
		this.model = model;
		this.ram = ram;
		this.storage = storage;
	}

	@Override
	public String toString() {
		return super.toString()+", model=" + model + ", storage=" + storage + ", ram=" + ram + ", camera=" + camera + "]";
	}
	
	

}
