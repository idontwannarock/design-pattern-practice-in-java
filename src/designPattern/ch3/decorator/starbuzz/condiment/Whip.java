package designPattern.ch3.decorator.starbuzz.condiment;

import designPattern.ch3.decorator.starbuzz.beverage.Beverage;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10 + this.beverage.getSize().condimentCost;
    }
}
