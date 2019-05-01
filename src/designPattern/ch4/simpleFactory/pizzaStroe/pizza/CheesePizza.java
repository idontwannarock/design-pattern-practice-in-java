package designPattern.ch4.simpleFactory.pizzaStroe.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza ingredients.");
    }

    @Override
    public void bake() {
        System.out.println("Baking.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting in half.");
    }

    @Override
    public void box() {
        System.out.println("Boxing.");
    }
}
