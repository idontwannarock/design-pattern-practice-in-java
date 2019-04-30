package ch3.decoratorPattern.starbuzz.condiment;

import ch3.decoratorPattern.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
