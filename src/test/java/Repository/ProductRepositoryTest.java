package Repository;
import Inheritance.and.extensibility.of.systems.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ProductRepositoryTest {

    ProductRepository repo = new ProductRepository();

    Product product1 = new Book(1, "Название 1", 100, "Автор 1");
    Product product2 = new Book(2, "Название 2", 200, "Автор 2");
    Product product3 = new Smartphone(3, "Модель 1", 300, "Произв. 1");
    Product product4 = new Smartphone(4, "Модель 2", 400, "Произв. 2");



    @Test

    public void testSave() {

        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.save(product4);


        Product[] expected = {product1, product2, product3,product4};
        Product[] actual = repo.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

        public void testRemoveById () {

            repo.save(product1);
            repo.save(product2);
            repo.save(product3);
            repo.save(product4);


            repo.removeById(product1.getId());
            repo.removeById(product4.getId());

            Product[] expected = {product2, product3};
            Product[] actual = repo.getProducts();

            Assertions.assertArrayEquals(expected, actual);
    }

    public void searchIfNoneProductsFit() {


    }













    }


