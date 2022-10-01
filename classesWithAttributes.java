

public class classesWithAttributes {

	public static void main(String[] args) {
		//parametreli constructor
		//Product product = new Product(1, "Laptop", "Lenovo Laptop", 7352, 5, "black"); 
		//ikisini bir kullandigimizda overloading olur
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Lenovo Laptop");
		product.setStockAmount(5);
		product.setPrice(7352);
		product.setColour("black");
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());
		

	}

}
