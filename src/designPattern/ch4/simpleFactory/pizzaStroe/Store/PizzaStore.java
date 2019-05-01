package designPattern.ch4.simpleFactory.pizzaStroe.Store;

import designPattern.ch4.simpleFactory.pizzaStroe.factory.SimplePizzaFactory;
import designPattern.ch4.simpleFactory.pizzaStroe.factory.SimplePizzaFactory.PizzaType;
import designPattern.ch4.simpleFactory.pizzaStroe.pizza.Pizza;

public class PizzaStore {

    SimplePizzaFactory pizzaFactory;

    public PizzaStore() {
        pizzaFactory = new SimplePizzaFactory();
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
