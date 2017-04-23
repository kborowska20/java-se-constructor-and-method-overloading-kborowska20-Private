import java.util.concurrent.atomic.AtomicInteger;

public class Supplier {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String name;
    private String description;

    public Supplier(){
        this.id = count.incrementAndGet();
        this.name = "no supplier";
        this.description = "no description";
    }

    public Supplier(String name, String description){
        this.id = count.incrementAndGet();
        this.name = name;
        this.description = description;
    }

    public String toString() {
        return "Id: " + id
                + " || name: " + name
                + " || discrription: " + description;
    }

}