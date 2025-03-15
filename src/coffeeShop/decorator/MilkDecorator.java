package coffeeShop.decorator;

import coffeeShop.coffee.Coffee;


public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return coffee.getCost() + 0.4; }
    public String getDescription() { return coffee.getDescription() + ", Milk"; }
}
