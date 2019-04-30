package designPattern.ch3.decorator.starbuzz.condiment;

import designPattern.ch3.decorator.starbuzz.beverage.Beverage;

public class SteamedMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10 + this.beverage.getSize().condimentCost;
    }
}
