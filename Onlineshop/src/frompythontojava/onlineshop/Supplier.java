import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;

public class Supplier {
    private static final AtomicInteger count = new AtomicInteger(0);
    public final int id;
    private String name;
    private String description;
    static ArrayList<Supplier> supplierList = new ArrayList<Supplier>();

    public Supplier() {
        this.id = count.incrementAndGet();
        this.name = "no supplier";
        this.description = "no description";
        supplierList.add(this);
    }

    public Supplier(String name, String description) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.description = description;
        supplierList.add(this);
    }

    public String toString() {
        return "Id: " + id
                + " || name: " + name
                + " || discrription: " + description;
    }

    public static ArrayList<Supplier> getAllSupplier() {
        return supplierList;
    }

    public static Supplier getSupplier(Integer supplierId) {
        return supplierList.get(supplierId - 1);
    }
}
