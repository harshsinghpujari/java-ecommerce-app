package project3;
import java.util.*;

public class ProductDriver {

	public static void main(String[] args) {
		
		ProductService ps = new ProductService();
		Scanner sc = new Scanner(System.in);
		
		ps.addProduct(new Shirt("101","Shirt","addidas",2034,
					"casual",36,"blue" , "full"));
	
		while(true) {
		System.out.println("\n E-commerce App");
		System.out.println("1) Add product");
		System.out.println("2) get product");
		System.out.println("3) updateProductPrice");
		System.out.println("4) Delete Product");
		System.out.println("5) Display All product");
		System.out.println("6) Exit");
		System.out.println("Select your choice");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch (choice) {
		case 1: {
			System.out.println("Select Product Type");
			System.out.println("1) Shirt");
			System.out.println("2) Tshirt");
			System.out.println("3) Mobile");
			System.out.println("Enter your choice:");
			int productType = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Product Id");
			String productId = sc.nextLine();
			System.out.println("Enter brand");
			String brand = sc.nextLine();
			System.out.println("Enter Price");
			double price = sc.nextDouble();
			sc.nextLine();
			
			switch (productType) {
			case 1: {
				String category = "shirt";
				sc.nextLine();
				System.out.println("Enter subCategory");
				String subCategory = sc.nextLine();
				System.out.println("Enter Size");
				int size = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter color");
				String color = sc.nextLine();
				System.out.println("Enter type");
				String type = sc.nextLine();
				ps.addProduct(new Shirt(productId ,category , brand, price , subCategory , size  , color, type));
				break;
			}
			case 2: {
				String category = "Tshirt";
				System.out.println("Enter subCategory");
				String subCategory = sc.nextLine();
				System.out.println("Enter Size");
				int size = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter color");
				String color = sc.nextLine();
				System.out.println("Enter type");
				String type = sc.nextLine();
				ps.addProduct(new Tshirt(productId ,category , brand, price , subCategory , size  , color, type));
				
				break;
			}
			case 3: {
				String category = "Mobile";
				System.out.println("Enter Model");
				String model = sc.nextLine();
				System.out.println("Enter Storage like 1, 2, 3gb");
				int storage = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Ram size");
				int ram = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Camera");
				String camera = sc.nextLine();
	
				ps.addProduct(new Mobile(productId ,category , brand, price ,model ,storage,ram,camera));
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + productType);
			}
			break;
			
		}
		case 2:{
			System.out.println("Enter your product id: ");
			String productId = sc.nextLine();
			Product product = ps.getProduct(productId);
			System.out.println(product);
			break;
		}
		case 3:
		{
			System.out.println("Enter the product id of product");
			String productId = sc.nextLine();
			System.out.println("Enter the new Product Price");
			double newPrice = sc.nextDouble();
			ps.updateProductPrice(productId, newPrice);
			break;
		}
		case 4:{
			System.out.println("Enter the product id");
			String productId = sc.nextLine();
			ps.deleteProduct(productId);
			break;
		}
		case 5: {
			ps.displayAll();
			break;
			}
		case 6: {
			System.out.println("Thankyou for  using the E-commerce app!");
			sc.close();
			return;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
}
