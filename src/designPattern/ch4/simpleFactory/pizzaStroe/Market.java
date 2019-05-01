package designPattern.ch4.simpleFactory.pizzaStroe;

import designPattern.ch4.simpleFactory.pizzaStroe.Store.PizzaStore;

import static designPattern.ch4.simpleFactory.pizzaStroe.factory.SimplePizzaFactory.PizzaType.PEPPERONI;

public class Market {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.orderPizza(PEPPERONI);
    }
}
