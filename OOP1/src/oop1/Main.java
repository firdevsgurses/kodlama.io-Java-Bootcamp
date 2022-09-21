package oop1;

public class Main {

	public static void main(String[] args) {
		//String message = "Vade oranı";
		
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smag Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(8500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(2);
		product3.setUnitPrice(4300);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image3.jpg");
	
		Product[] products = {product1, product2, product3};
		for(Product product : products) {
			System.out.println(product.getName());	
		}
		//okurken get, veri yazarken set yapiyoruz;
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("050000000");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Firdevs");
		individualCustomer.setLastName("Gurses");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhoneNumber("0599999999");
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		
		
		
		
	}
}
