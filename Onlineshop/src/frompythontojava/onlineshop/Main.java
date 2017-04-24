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
                case 3:
                    Menu.seeProductInMyBasket(basket);
                    break;
                case 4:
                    Menu.removeProductFromMyBasket(basket);
                    break;
                case 5:
                    Menu.changeSupplier();
                    break;
                case 6:
                    Menu.displayAllAvailableProducts();
                    break;
                case 7:
                    Menu.getListOfProductBySupplier();
                    break;
                case 8:
                    Menu.getListOfProductByProductCategory();
                    break;
                case 9:
                    Menu.creatNewSupplier();
                    break;
                case 10:
                    Menu.CreateProductCategoryOrFeaturedProductCategory();
                    break;
                case 11:
                    Menu.displayAvailableProduct();
                    break;
                case 12:
                    Menu.readProductCategoryDescription();
                    break;
                case 13:
                    Menu.changeProductsCategory();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
