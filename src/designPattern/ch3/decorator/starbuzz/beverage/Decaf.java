package designPattern.ch3.decorator.starbuzz.beverage;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
