package designPattern.ch3.decorator.starbuzz.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
