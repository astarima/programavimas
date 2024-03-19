package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Restaurant restaurant = new Restaurant("Astos blynai");
        MainDish blynai = new MainDish("Blyneliai", 4.99, MainDish.Type.BLYNAI , true, 875);
        Desert pyragaitis = new Desert("Sokoladainis", 2.99, Desert.Type.PYRAGAS, false, 995);
        Beverage gerimas = new Beverage("Latte", 1.99, 250, Beverage.Type.KAVA, false);

        blynai.setQuantity(20);
        pyragaitis.setQuantity(30);
        gerimas.setQuantity(50);

        restaurant.addProduct(blynai);
        restaurant.addProduct(pyragaitis);
        restaurant.addProduct(gerimas);
        restaurant.printMenu();

        Order order = new Order();
        order.addProduct(blynai);
        order.addProduct(pyragaitis);
        order.addProduct(gerimas);

        System.out.println(order.getPrice());

        restaurant.order(order);
        restaurant.printMenu();
    }
}
