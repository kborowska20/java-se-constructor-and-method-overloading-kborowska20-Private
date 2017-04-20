import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


class Product {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    String name;
    Float defaultPrice;
    ProductCategory productCategory;
    static ArrayList<Product> productList = new ArrayList<Product>();
    Supplier suppiler;


    public Product(){
        this.id = count.incrementAndGet();
        this.name = "produkt";
        this.defaultPrice = 0f;
        this.productCategory = productCategory;
        this.suppiler = suppiler;
        productList.add(this);

    }

    public Product(String name, Float defaultPrice, ProductCategory productCategory){
        this.id = count.incrementAndGet();
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
        this.suppiler = suppiler;
        productList.add(this);

    }

    public String toString() {
        return "id: " + id
                + " name: " + name
                + " defaultPrice: " + defaultPrice
                + " productCategory: " + productCategory
                + " productCategory: " + productCategory
                + " suppiler: " + suppiler;
    }

    public static ArrayList<Product> getAllProducts() {
        return productList;
    }

    public static void main(String [] args) {

        //Product product = new Product();
        //ProductCategory pc = new ProductCategory("stal","jdhff","mleko");
        //Product product1 = new Product("złaom", 2.55f, pc);
        //Product product2 = new Product("maka", 133.44f, pc);
        //System.out.println(Product.getAllProducts());
        //System.out.println(product2.toString());
    }
}