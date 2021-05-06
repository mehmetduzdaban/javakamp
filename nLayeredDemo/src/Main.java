import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerManagerAdapter;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());

		Product product = new Product(1, 2, "Elma", 12, 50);

		productService.add(product);
	}

}
