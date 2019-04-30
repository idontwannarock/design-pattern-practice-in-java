package designPattern.ch3.decorator.starbuzz.beverage;

public abstract class Beverage {

    String description = "Unknown Beverage";

    Size size = Size.GRANDE;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

    public enum Size {

        TALL(-0.05), GRANDE(0.0), VENTI(0.05);

        public double condimentCost;

        Size(double condimentCost) {
            this.condimentCost = condimentCost;
        }
    }
}
