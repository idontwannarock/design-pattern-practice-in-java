import ch3.decoratorPattern.starbuzz.beverage.Beverage;
import ch3.decoratorPattern.starbuzz.beverage.DarkRoast;
import ch3.decoratorPattern.starbuzz.beverage.Espresso;
import ch3.decoratorPattern.starbuzz.beverage.HouseBlend;
import ch3.decoratorPattern.starbuzz.condiment.Mocha;
import ch3.decoratorPattern.starbuzz.condiment.Soy;
import ch3.decoratorPattern.starbuzz.condiment.Whip;
import org.junit.Test;

public class Ch3StarbuzzCoffeeShop {

    @Test
    public void main() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
