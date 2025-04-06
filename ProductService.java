package project3;
import java.util.*;

public class ProductService {

	private Map<String , Product> map = new HashMap<>();
	
	public void addProduct(Product product)
	{
		if(map.containsKey(product.getProductId()))
		{
			System.out.println("Product id already exists");
		}
		else {
		map.put(product.getProductId(), product);
		System.out.println("product added: " + product);
		}
	}
	
	public Product getProduct(String productId)
	{
		Product product = map.get(productId);
		if(product==null)
		{
			System.out.println("product not found");
		}
		return product;
	}
	
	public void updateProductPrice(String productId,double newPrice){
		Product product = map.get(productId);
		if(product != null)
		{
			product.setPrice(newPrice);
			System.out.println("Price updated succesfully");
		}
		else
		{
			System.out.println("Cannot update. product not found with id");
		}
	}
	public void deleteProduct(String productId)
	{
		if(map.remove(productId)!=null)
		{
			System.out.println("product removed succesfully");
		}
		else
		{
			System.out.println("no product found");
		}
		
	}
	
	
	public void displayAll()
	{
		for (Product p : map.values()) {
			
			System.out.println(p);
		}
	}
}
