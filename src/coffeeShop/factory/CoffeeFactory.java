package coffeeShop.factory;

import coffeeShop.coffee.Coffee;


public interface CoffeeFactory {
    Coffee createCoffee(String type);
}
