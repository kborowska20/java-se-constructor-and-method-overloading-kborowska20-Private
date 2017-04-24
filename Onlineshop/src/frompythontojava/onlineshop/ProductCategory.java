import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class ProductCategory {
    private static final AtomicInteger count = new AtomicInteger(0);
    public final int id;
    String name;
    String departament;
    String description;
    static ArrayList<ProductCategory> categories = new ArrayList<ProductCategory>();

    public ProductCategory(){
        this.id = count.incrementAndGet();
        this.name = "no name";
        this.departament = "no departament";
        this.description = "no discrription";
        categories.add(this);
    }

    public ProductCategory(String name,String departament,String description) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.departament = departament;
        this.description = description;
        categories.add(this);
    }

    public String toString() {
        return "id: " + id
                + " || name: " + name
                + " || departament: " + departament
                + " || discrription: " + description;
    }

    public static ArrayList<ProductCategory> getAllProductCategory() {
        return categories;
    }

    public String getName(){
        return "id: \n" + this.id
                + " || name: " + this.name;
    }

    public static ProductCategory getProductCategory(Integer id) {
        return categories.get(id - 1);
    }
    public boolean isavailable(){
        return true;
    }
}