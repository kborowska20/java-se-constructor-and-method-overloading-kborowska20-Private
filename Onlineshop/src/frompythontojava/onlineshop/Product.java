import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


class Product {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    String name;
    Float defaultPrice;
    ProductCategory productCategory;
    static ArrayList<Product> productList = new ArrayList<Product>();
    Supplier supplier;


    public Product(){
        this.id = count.incrementAndGet();
        this.name = "produkt";
        this.defaultPrice = 0f;
        this.productCategory = productCategory;
        this.supplier = supplier;
        productList.add(this);

    }

    public Product(String name, Float defaultPrice, ProductCategory productCategory){
        this.id = count.incrementAndGet();
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
        this.supplier = supplier;
        productList.add(this);

    }

    public String toString() {
        return "id: " + id
                + " name: " + name
                + " defaultPrice: " + defaultPrice
                + " productCategory: " + productCategory
                + " supplier: " + supplier;
    }

    public static ArrayList<Product> getAllProducts() {
        return productList;
    }

    public static ArrayList<Product> getAllProductsBy(ProductCategory productCategory) {
        ArrayList<Product> allProductsByProductCategory = new ArrayList<Product>();
        for(int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if(product.productCategory == productCategory){
                allProductsByProductCategory.add(product);
            }
        }
        return allProductsByProductCategory;
    }

    public static ArrayList<Product> getAllProductsBy(Supplier productSupplier){
        ArrayList<Product> allProductsByproductSupplier = new ArrayList<Product>();
        for(int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if(product.supplier == productSupplier){
                allProductsByproductSupplier.add(product);
            }
        }
        return allProductsByproductSupplier;
    }
}