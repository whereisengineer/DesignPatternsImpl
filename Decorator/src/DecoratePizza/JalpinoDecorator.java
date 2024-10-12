package DecoratePizza;

import PizzaComponent.Pizza;

public class JalpinoDecorator implements Pizza {

    private Pizza pizza;

    public JalpinoDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    private void addJalpino(){
        System.out.println("Jalpinos added.");
    }

    @Override
    public int pizzaCost() {
        addJalpino();
       return pizza.pizzaCost() + 5;
    }
}
