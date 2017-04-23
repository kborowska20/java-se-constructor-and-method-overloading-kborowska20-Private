import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class ProductCategory {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    String name;
    String departament;
    String description;

    public ProductCategory(){
        this.id = count.incrementAndGet();
        this.name = "no name";
        this.departament = "no departament";
        this.description = "no discrription";
    }

    public ProductCategory(String name,String departament,String description) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.departament = departament;
        this.description = description;
    }

    public String toString() {
        return "id: " + id
                + " || name: " + name
                + " || departament: " + departament
                + " || discrription: " + description;
    }
}