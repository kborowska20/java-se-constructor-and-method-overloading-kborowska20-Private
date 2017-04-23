import java.util.Scanner;


public class Menu {

    public static void displayMenu() {
        System.out.println("Menu:\n" +
                "1.Create new product\n" +
                "2.Add product to your basket\n" +
                "3...\n" +
                "2.Remove product form your basket\n" +
                "6.List of all products in shop\n" +
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

    public static void displayAllProductsInShop() {
        for(int p = 0; p < Product.getAllProducts().size(); p++){
            System.out.println("--------------------------------------------------------");
            Product product = Product.getAllProducts().get(p);
            System.out.println(product.toString());
        }

    }
     public static void addProductToMyBasket(Basket basket) {
         Scanner userInput = new Scanner(System.in);
         displayAllProductsInShop();
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
}


