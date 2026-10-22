// A PhysicalProduct IS-A Product because it inherits from Product class(Parent class).
// ShoppingSystem Has-A Product because it contains product rather than being a product.


package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // constructor
    public PhysicalProduct(){}

    public PhysicalProduct(Long id,
                           String name,
                           double price,
                           double weightKg,
                           String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // getters
    public double getWeightKg(){
        return weightKg;
    }
    public String getDimensions(){
        return dimensions;
    }

}
