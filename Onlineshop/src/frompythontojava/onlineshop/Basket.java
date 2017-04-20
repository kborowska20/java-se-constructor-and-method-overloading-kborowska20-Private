import java.util.Iterator;
import java.util.ArrayList;


class Basket {
    private ArrayList<Product> productList;
    private Iterator iterator;

    public Basket() {
        this.iterator = iterator;
        this.productList = new ArrayList<Product>();

    }

    public Iterator getIterator(){ return this.iterator;}

    public void addProduct(Product product){
        this.productList.add(product);
    }

    public Boolean removeProduct(Product product){
         if(this.productList.remove(product)) {
            return true;
        } else {
             return false;
        }

    }
}