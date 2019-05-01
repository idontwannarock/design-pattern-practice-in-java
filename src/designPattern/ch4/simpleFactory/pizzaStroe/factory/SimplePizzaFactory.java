package designPattern.ch4.simpleFactory.pizzaStroe.factory;

import designPattern.ch4.simpleFactory.pizzaStroe.pizza.*;

public class SimplePizzaFactory {

    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE: return new CheesePizza();
            case VEGGIE: return new VeggiePizza();
            case CLAM: return new ClamPizza();
            default: return new PepperoniPizza();
        }
    }

    public enum PizzaType {
        CHEESE, VEGGIE, CLAM, PEPPERONI
    }
}
