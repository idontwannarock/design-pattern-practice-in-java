package designPattern.ch3.decorator.starbuzz;

import designPattern.ch3.decorator.starbuzz.beverage.Beverage;
import designPattern.ch3.decorator.starbuzz.beverage.Beverage.Size;
import designPattern.ch3.decorator.starbuzz.beverage.DarkRoast;
import designPattern.ch3.decorator.starbuzz.beverage.Espresso;
import designPattern.ch3.decorator.starbuzz.beverage.HouseBlend;
import designPattern.ch3.decorator.starbuzz.condiment.Mocha;
import designPattern.ch3.decorator.starbuzz.condiment.Soy;
import designPattern.ch3.decorator.starbuzz.condiment.Whip;

public class StarbuzzCoffeeShop {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + String.format("%.2f", beverage.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost()));
    }
}
