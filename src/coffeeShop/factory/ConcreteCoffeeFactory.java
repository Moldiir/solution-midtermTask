package coffeeShop.factory;

import coffeeShop.coffee.Americano;
import coffeeShop.coffee.Cappuccino;
import coffeeShop.coffee.Coffee;
import coffeeShop.coffee.Espresso;
import coffeeShop.coffee.Latte;
import coffeeShop.coffee.Mocha;

public class ConcreteCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "latte" -> new Latte();
            case "cappuccino" -> new Cappuccino();
            case "americano" -> new Americano();
            case "mocha" -> new Mocha();
            default -> throw new IllegalArgumentException("Unknown coffee type: " + type);
        };
    }
}
