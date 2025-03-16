package coffeeShop;

import coffeeShop.coffee.Coffee;
import coffeeShop.decorator.*;
import coffeeShop.factory.CoffeeFactory;
import coffeeShop.factory.ConcreteCoffeeFactory;

import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        CoffeeFactory factory = new ConcreteCoffeeFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a coffee (espresso, latte, cappuccino, americano, mocha):");
        String coffeeType = scanner.nextLine();
        Coffee coffee = factory.createCoffee(coffeeType);

        System.out.println("Add toppings (type one by one: milk, soy, almond, oat, chocolate, caramel, cream; type 'done' to finish):");
        while (true) {
            String topping = scanner.nextLine();
            switch (topping.toLowerCase()) {
                case "milk" -> coffee = new MilkDecorator(coffee);
                case "soy" -> coffee = new SoyMilkDecorator(coffee);
                case "almond" -> coffee = new AlmondMilkDecorator(coffee);
                case "oat" -> coffee = new OatMilkDecorator(coffee);
                case "chocolate" -> coffee = new ChocolateDecorator(coffee);
                case "caramel" -> coffee = new CaramelDecorator(coffee);
                case "cream" -> coffee = new WhippedCreamDecorator(coffee);
                case "done" -> {
                    System.out.println("\nYour Order:");
                    System.out.println("Description: " + coffee.getDescription());
                    System.out.println("Total Cost: $" + coffee.getCost());
                    return;
                }
                default -> System.out.println("Unknown topping. Try again.");
            }
        }
    }
}
