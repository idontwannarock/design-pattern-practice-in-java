package designPattern.ch3.decorator.starbuzz.beverage;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
