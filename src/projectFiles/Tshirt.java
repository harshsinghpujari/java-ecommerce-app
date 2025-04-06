package project3;

public class Tshirt extends Product{

	private String subCategory;
	private int size;
	private String color;
	private String type;//full-sleeves or Half-sleeves
	
	public Tshirt(String productId,String category , String brand , double price,String subCategory , int size , String color , String type)
	{
		super(productId , category , brand , price);
		
		this.subCategory = subCategory;
		this.size = size;
		this.color = color;
		this.type = type;
		
	}

	@Override
	public String toString() {
		return super.toString()+",subCategory=" + subCategory + ",size=" + size + ",color=" + color + ",type=" + type + "]";
	}
	



}
