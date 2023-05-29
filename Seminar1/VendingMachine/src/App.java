import Domain.Bottle;
import Domain.HotDrinks;
import Domain.Product;
import VendingMachine.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays", "Chips", 12.0);
        Product item2 = new Bottle(2,"Cola","Water", 25.0, 5.5);
        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Oil", "Oil", 15.59));
        Product item3 = new HotDrinks(4, "tea", "Hot Drink", 4.0, 85);
        iMachine.addProduct(item3);
        Product item4 = new HotDrinks(5, "black coffee", "Hot Drink", 8.5, 80);
        iMachine.addProduct(item4);
        Product item5 = new HotDrinks(6, "capuccino", "Hot Drink", 12.0, 90);
        iMachine.addProduct(item5);
        for (Product prod: iMachine.getProducts()){
            System.out.println(prod.toString());
        }
       
    } 
}
