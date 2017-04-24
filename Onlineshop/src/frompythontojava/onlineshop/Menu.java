import java.util.Scanner;
import java.util.Iterator;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Menu {

    public static void displayMenu() {
        System.out.println("Menu:\n" +
                "1.Create new product\n" +
                "2.Add product to your basket\n" +
                "3.See product in my basket\n" +
                "4.Remove product form your basket\n" +
                "5.Change product's supplier\n" +
                "6.List available products in shop\n" +
                "7.Get list of products from specific supplier\n" +
                "8.Get list of products from specific product category\n" +
                "9.Create new Supplier\n" +
                "10.Create new product category or new featured product category\n" +
                "11.Check availability of specific product\n" +
                "12.Read product category description\n" +
                "13.Change product's category \n" +
                "0.System exit\n");
    }

    public static void creatNewProduct() {
        Scanner userInput = new Scanner(System.in);
        ProductCategory productCategory = new ProductCategory();
        System.out.println("Enter values of new product: ");
        System.out.print("Name: ");
        String name = userInput.next();
        System.out.print("default price: ");
        Float value = userInput.nextFloat();
        Product product = new Product(name, value, productCategory);
        System.out.println("Done!");
    }

    public static void displayAllAvailableProducts() {
        for (int p = 0; p < Product.getAllProducts().size(); p++) {
            Product product = Product.getAllProducts().get(p);
            if (product.getProductsCategory().isavailable() == true) {
                System.out.println(product.toString());
            }
        }
    }
     public static void addProductToMyBasket(Basket basket) {
         Scanner userInput = new Scanner(System.in);
         displayAllAvailableProducts();
         System.out.print("Choose product id: ");
         int id = userInput.nextInt();
         for (int i = 0; i < Product.productList.size(); i++) {
             Product product = Product.productList.get(i);
             if (product.id == id) {
                 basket.addProduct(product);
                 System.out.println("You add new product to your basket.");
             }
         }
     }
    public static void removeProductFromMyBasket(Basket basket) {
        Scanner userInput = new Scanner(System.in);
        seeProductInMyBasket(basket);
        System.out.print("Choose product id: ");
        int id = userInput.nextInt();
        Product product = Product.getProduct(id);
        basket.removeProduct(product);
        System.out.println("You reomved product from your basket.");
        }

    public static void seeProductInMyBasket(Basket basket) {
        Iterator iter = basket.getIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    public static Supplier creatNewSupplier(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter values of new Supplier: ");
        System.out.print("Name: ");
        String name = userInput.next();
        System.out.print("description: ");
        String description = userInput.next();
        Supplier supplier = new Supplier(name, description);
        System.out.println("Done!");
        return supplier;
    }
     public static void changeSupplier(){
         for (int p = 0; p < Supplier.getAllSupplier().size(); p++) {
             System.out.println("--------------------------------------------------------");
             Supplier supplier = Supplier.getAllSupplier().get(p);
             System.out.println(supplier.toString());
         }
         Scanner userInput = new Scanner(System.in);
         System.out.print("Choose supplier id: ");
         int supplierId = userInput.nextInt();
         Supplier supplier = Supplier.getSupplier(supplierId);
         System.out.print("Choose product id: ");
         int productId = userInput.nextInt();
         Product product = Product.getProduct(productId);
         product.setSupplier(supplier);
         }

     public static void readProductCategoryDescription(){
         for(int p = 0; p < ProductCategory.getAllProductCategory().size(); p++){
             System.out.println("--------------------------------------------------------");
             ProductCategory productCategory = ProductCategory.getAllProductCategory().get(p);
             System.out.println(productCategory.getName());
         }
         System.out.print("Choose product category id: ");
         Scanner userInput = new Scanner(System.in);
         int productCategoryId = userInput.nextInt();
         ProductCategory productCategory1 =ProductCategory.getProductCategory(productCategoryId);
         System.out.println(productCategory1.toString());
     }
     public static void getListOfProductBySupplier() {
         for (int s = 0; s < Supplier.getAllSupplier().size(); s++) {
             System.out.println("--------------------------------------------------------");
             Supplier supplier = Supplier.getAllSupplier().get(s);
             System.out.println(supplier.toString());
         }
             Scanner userInput = new Scanner(System.in);
             System.out.print("Filter by (supplier id): ");
             int supplierId = userInput.nextInt();
             Supplier choosenSupplier = Supplier.getSupplier(supplierId);
             for (int p = 0; p < Product.getAllProductsBy(choosenSupplier).size(); p++) {
                 System.out.println("--------------------------------------------------------");
                 Product filtredProduct = Product.getAllProductsBy(choosenSupplier).get(p);
                 System.out.println(filtredProduct.toString());
             }
     }
    public static void getListOfProductByProductCategory() {
        for(int p = 1; p < ProductCategory.getAllProductCategory().size(); p++){
            System.out.println("--------------------------------------------------------");
            ProductCategory productCategory = ProductCategory.getAllProductCategory().get(p);
            System.out.println(productCategory.getName());
        }
        System.out.print("Filter by (product category id): ");
        Scanner userInput = new Scanner(System.in);
        int productId = userInput.nextInt();
        ProductCategory productCategory = ProductCategory.getProductCategory(productId);
            for (int p = 0; p < Product.getAllProductsBy(productCategory).size(); p++) {
                System.out.println("--------------------------------------------------------");
                Product product = Product.getAllProductsBy(productCategory).get(p);
                System.out.println(product.toString());
        }
    }
    public static void changeProductsCategory(){
        for(int p = 1; p < ProductCategory.getAllProductCategory().size(); p++){
            System.out.println("--------------------------------------------------------");
            ProductCategory productCategory = ProductCategory.getProductCategory(p);
            System.out.println(productCategory.getName());
        }
        Scanner userInput = new Scanner(System.in);
        System.out.print("Choose Products Category id: ");
        int ProductsCategoryId = userInput.nextInt();
        ProductCategory productCategory = ProductCategory.getProductCategory(ProductsCategoryId);
        System.out.print("Choose product id: ");
        int productId = userInput.nextInt();
        Product product = Product.getProduct(productId);
        product.setProductsCategory(productCategory);
    }
    public static void displayAvailableProduct() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("product id: ");
        int productId = userInput.nextInt();
        Product product = Product.getProduct(productId);
        if (product.getProductsCategory().isavailable()) {
            System.out.println("product is avaiable");
        } else {
            System.out.println("product is not avaiable");
        }
    }
    public static void CreateProductCategoryOrFeaturedProductCategory(){
        Scanner userInputOp = new Scanner(System.in);
        System.out.println("1.Creat new Product Category");
        System.out.println("2.Creat new Featured Product Category ");
        System.out.print("choose option: ");
        int optionMenuoP = userInputOp.nextInt();
        switch (optionMenuoP){
            case 1:
                Scanner userInput = new Scanner(System.in);
                System.out.print("Name: ");
                String name = userInput.next();
                System.out.print("description: ");
                String description = userInput.next();
                System.out.print("discrription: ");
                String discrription = userInput.next();
                ProductCategory productCategory = new ProductCategory(name,description,discrription);
                break;
            case 2:
                Scanner userInput1 = new Scanner(System.in);
                System.out.print("Name: ");
                String fname = userInput1.next();
                System.out.print("description: ");
                String fdescription = userInput1.next();
                System.out.print("discrription: ");
                String fdiscrription = userInput1.next();
                System.out.print("start date (format: dd-MMM-yyyy): ");
                String ustartDate = userInput1.next();
                System.out.print("end date (format: dd-MMM-yyyy): ");
                String uendDate = userInput1.next();
                DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date startDate = new Date();
                Date endDate = new Date();
                try {
                    startDate = format.parse(ustartDate);
                    endDate = format.parse(uendDate);
                } catch (ParseException p) {
                    System.out.print("Error");
                }
                FeaturedProductCategory featuredProductCategory = new FeaturedProductCategory(fname,fdescription,fdiscrription,startDate,endDate);
                break;
        }
    }
}



