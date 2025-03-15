package coffeeShop.decorator;

import coffeeShop.coffee.Coffee;


public class SoyMilkDecorator extends CoffeeDecorator {
    public SoyMilkDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return coffee.getCost() + 0.5; }
    public String getDescription() { return coffee.getDescription() + ", Soy Milk"; }
}
