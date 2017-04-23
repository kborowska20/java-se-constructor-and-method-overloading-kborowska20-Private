import java.util.Iterator;
import java.util.ArrayList;


public class Basket {
    private ArrayList<Product> productList = new ArrayList<Product>();;
    private Iterator iterator;

    public class ProductIterator implements Iterator{
        int index = 0;

        @Override
        public Object next() {
            if (this.hasNext()) {
                return productList.get(index++);
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            if (index < productList.size()) {
                return true;
            }
            return false;
        }

    }

    public Iterator getIterator() {
        return new ProductIterator();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Boolean removeProduct(Product product) {
        Iterator iterator = this.getIterator();
        while (iterator.hasNext()) {
            if (product == iterator.next()) {
                productList.remove(product);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
}