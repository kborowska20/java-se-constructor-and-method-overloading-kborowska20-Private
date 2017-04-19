import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


class Product {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    String name;
    Float defaultPrice;
    ProductCategory productCategory;
    ArrayList<Product> productList = new ArrayList<Product>();


    public Product(){
        this.id = count.incrementAndGet();
        this.name = "produkt";
        this.defaultPrice = 0f;
        this.productCategory = productCategory;
        this.suppiler = suppiler;
        this.productList = productList;

    }

    public Product(String name, Float defaultPrice, ProductCategory productCategory){
        this.id = count.incrementAndGet();
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
        this.suppiler = suppiler;
        this.productList = productList;

    }

    public ArrayList<Product> getAllProducts() {
        return productList;
    }

    public static void main(String [] args) {

        Product product = new Product();
        System.out.println(product.getAllProducts());
    }
}