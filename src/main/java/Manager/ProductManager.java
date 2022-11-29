package Manager;
import Inheritance.and.extensibility.of.systems.Product;
import Repository.ProductRepository;

public class ProductManager {
    protected ProductRepository repo;


    public ProductManager(ProductRepository repo) {
    this.repo = repo;
    }

    public void add(Product product){
        repo.save(product);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repo.getProducts()) {
            if (matches(product, text)) {

            }
        }
        return result;
    }


    public boolean matches(Product product, String search) {
        if (product.getTitle().contains(search)) {
            return true;
        } else {
            return false;
        }

    }
}




