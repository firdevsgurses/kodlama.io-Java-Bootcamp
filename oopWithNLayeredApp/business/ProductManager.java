package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao; //interface
	private Logger[] loggers;//List<Logger> loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		//is kurallarini yaziyoruz
		if(product.getUnitPrice()<10) {
			throw new Exception("unit price cannot be less than 10!");
		}
	
		//ProductDao productDao = new JdbcProductDao();
		productDao.add(product);
		for (Logger logger : loggers) { //[db, mail]
			logger.log(product.getName());
		}
		
	}
}
