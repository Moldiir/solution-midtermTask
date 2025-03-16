# Smart Home Control System 

## Objective
This Java-based simulation models a smart home environment by applying multiple structural and behavioral design patterns. The system manages smart devices like lights, thermostats, and cameras in a modular and extendable way.

##  Applied Design Patterns:
- **Composite** – groups devices into hierarchical structures (e.g., rooms)
- **Decorator** – adds extra features (e.g., logging, scheduling) dynamically
- **Abstract Factory** – produces basic or advanced families of smart devices
- **Facade** – provides centralized control interface for clients
- **Adapter** – integrates legacy/external systems with incompatible interfaces

##  System Architecture:
- **Leaf Nodes:** SmartDevice implementations: `SmartLight`, `SmartThermostat`, `SmartCamera`
- **Composite Nodes:** `SmartRoom` manages groups of devices
- **Decorator Classes:** `LoggingDecorator`, `ScheduledOperationDecorator` (extend device functionality)
- **Factory Classes:** `BasicSmartDeviceFactory`, `AdvancedSmartDeviceFactory` (for configurable device creation)
- **Adapter:** `DoorLockAdapter` integrates `LegacyDoorLock`
- **Facade:** `SmartHomeService` (acts as controller for all operations)

##  Functional Features:
- Add devices into composite smart rooms
- Power on/off all devices from centralized control
- Set global temperature across rooms
- Decorate devices with Logging or Scheduling behavior
- Integrate legacy systems like door locks via Adapter

##  Demo Instructions:
Run `SmartHomeService.java` from `/service/` package to simulate:
- Room and device creation
- Composite pattern behavior
- Factory & decorator demonstrations
- Adapter system integration
- Status reporting and control via Facade


# Coffee Shop Simulator 

## 🎯 Objective
A lightweight Java-based Coffee Ordering System to demonstrate Factory Method and Decorator patterns. Users can select a coffee base and customize it with dynamic toppings and ingredients.

## 🔧 Applied Design Patterns:
- **Factory Method** – for coffee object creation (Espresso, Latte, Cappuccino, Mocha, Americano)
- **Decorator Pattern** – for adding ingredients and modifying coffee behavior dynamically

## 📦 System Architecture:
- **Interface:** `Coffee` interface with `getCost()` and `getDescription()`
- **Coffee Types:** `Espresso`, `Latte`, `Cappuccino`, `Americano`, `Mocha`
- **Factory:** `CoffeeFactory`, `ConcreteCoffeeFactory` classes for coffee creation
- **Decorators:**
  - `MilkDecorator`
  - `SoyMilkDecorator`
  - `AlmondMilkDecorator`
  - `OatMilkDecorator`
  - `ChocolateDecorator`
  - `CaramelDecorator`
  - `WhippedCreamDecorator`

## ✅ Functional Features:
- Console-based UI to:
  - Choose coffee base
  - Add any combination of toppings
  - Display final customized order with cost and description

## ▶️ Demo Instructions:
Run `MainApp.java` from `/main/` package. Follow console prompts:
1. Choose coffee
2. Add toppings
3. View final description and price

