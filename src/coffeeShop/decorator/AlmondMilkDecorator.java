package coffeeShop.decorator;

import coffeeShop.coffee.Coffee;

public class AlmondMilkDecorator extends CoffeeDecorator {
    public AlmondMilkDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return coffee.getCost() + 0.6; }
    public String getDescription() { return coffee.getDescription() + ", Almond Milk"; }
}
