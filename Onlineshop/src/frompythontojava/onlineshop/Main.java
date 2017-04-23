import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        while (true) {
            Menu.displayMenu();
            System.out.print("Choose option: ");
            Scanner userInput = new Scanner(System.in);
            int menuOpcion = userInput.nextInt();

            switch (menuOpcion) {
                case 1:
                    Menu.creatNewProduct();
                    break;
                case 2:
                    Menu.addProductToMyBasket(basket);
                    break;
                case 6:
                    Menu.displayAllProductsInShop();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
// do drukowania
//Iterator iter = basket.getIterator();
//while (iter.hasNext()) {
//   System.out.println(iter.next());