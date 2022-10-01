
public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount, String colour) {
		System.out.println("yapici blok calisti");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.colour = colour;
	}
	public Product() {
		
	}
	
	// attribute || field
	
	//int id;
	//double price;
	//int stockAmount;
	//String name;
	//String description;
	//String colour;
	
	private int id;
	String name;
	double price;
	int stockAmount;
	String description;
	String colour;
	String code;
	
	//getter
	public int getId() { // id'yi okuyabilir ama yazamaz
		return id; // get okumak icin, degisiklik yapamiyoruz
	//read only = get
	}
	
	//setter
	public void setId(int id) {
		this.id = id; // _ olanlar field
		// this.id = id;  icinde bulundugumuz class
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCode() {
		return this.name.substring(0, 1) + id; // kodun hicbi sekilde yazilmasini istemiyoruz o yuzden setter yok
	}

	

	
	
	

}
