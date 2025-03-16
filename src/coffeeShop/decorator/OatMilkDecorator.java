package coffeeShop.decorator;

import coffeeShop.coffee.Coffee;


public class OatMilkDecorator extends CoffeeDecorator {
    public OatMilkDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return coffee.getCost() + 0.5; }
    public String getDescription() { return coffee.getDescription() + ", Oat Milk"; }
}