package coffeeShop.decorator;

import coffeeShop.coffee.Coffee;


public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return coffee.getCost() + 0.5; }
    public String getDescription() { return coffee.getDescription() + ", Whipped Cream"; }
}
