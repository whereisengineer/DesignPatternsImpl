package PizzaClient;

import DecoratePizza.JalpinoDecorator;
import DecoratePizza.MushroomDecorator;
import PizzaComponent.Pizza;
import PizzaComponent.PizzaImpl;

public class PizzaClient {
    public static void main(String[] args) {
        Pizza pizza = new PizzaImpl();

        Pizza jalpinoPizza = new JalpinoDecorator(new MushroomDecorator(new JalpinoDecorator(pizza)));
        System.out.println("total pizza cost "+ jalpinoPizza.pizzaCost());


    }
}
