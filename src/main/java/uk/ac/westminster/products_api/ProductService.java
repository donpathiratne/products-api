package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id){
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public List<Product> findByName(String name){
        return products.stream()
                .filter(product -> product.getName().contains(name))
                .toList();
    }

        // create the DigitalProduct
    public ProductService(){
        products.add(new DigitalProduct
                        (1L, "E-book", 400,
                        "www.ebook.lk/harrypotter", 500));
        // create the PhysicalProduct
        products.add(new PhysicalProduct
                        (2L,"Book",500,
                        0.6,"15*10*3cm"));
    }

    // id, name and prize fields are coming from parent Product class. Both DigitalProduct and
    // PhysicalProduct inherit their getters, allowing to appear properties in JSON response.






}
