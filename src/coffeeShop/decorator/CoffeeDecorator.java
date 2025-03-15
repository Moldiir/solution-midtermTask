package coffeeShop.decorator;

import coffeeShop.coffee.Coffee;


public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) { this.coffee = coffee; }
}

