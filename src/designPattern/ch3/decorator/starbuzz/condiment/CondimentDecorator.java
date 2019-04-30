package designPattern.ch3.decorator.starbuzz.condiment;

import designPattern.ch3.decorator.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
