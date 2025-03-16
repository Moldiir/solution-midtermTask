package coffeeShop.decorator;

import coffeeShop.coffee.Coffee;


public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return coffee.getCost() + 0.6; }
    public String getDescription() { return coffee.getDescription() + ", Caramel Syrup"; }
}