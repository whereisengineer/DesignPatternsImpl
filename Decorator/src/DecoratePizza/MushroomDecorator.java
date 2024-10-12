package DecoratePizza;

import PizzaComponent.Pizza;

public class MushroomDecorator implements Pizza {

    private Pizza pizza;
    public MushroomDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    void addMushrooms(){
        System.out.println("mushrooms are added.");
    }
    @Override
    public int pizzaCost() {

        addMushrooms();
        return pizza.pizzaCost() + 20;
    }
}
