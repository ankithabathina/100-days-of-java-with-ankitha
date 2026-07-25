// Component Interface
interface Pizza {

    String getDescription();

    double getCost();

}

// Concrete Component
class MargheritaPizza implements Pizza {

    @Override
    public String getDescription() {

        return "Margherita Pizza";

    }

    @Override
    public double getCost() {

        return 200.0;

    }

}

// Decorator Class
abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {

        this.pizza = pizza;

    }

}

// Concrete Decorator 1
class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {

        super(pizza);

    }

    @Override
    public String getDescription() {

        return pizza.getDescription() + ", Extra Cheese";

    }

    @Override
    public double getCost() {

        return pizza.getCost() + 50.0;

    }

}

// Concrete Decorator 2
class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza pizza) {

        super(pizza);

    }

    @Override
    public String getDescription() {

        return pizza.getDescription() + ", Mushroom";

    }

    @Override
    public double getCost() {

        return pizza.getCost() + 40.0;

    }

}

// Main Class
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Pizza pizza = new MargheritaPizza();

        System.out.println("Order: " + pizza.getDescription());
        System.out.println("Price: ₹" + pizza.getCost());

        pizza = new CheeseDecorator(pizza);

        System.out.println("\nAfter Adding Cheese");
        System.out.println("Order: " + pizza.getDescription());
        System.out.println("Price: ₹" + pizza.getCost());

        pizza = new MushroomDecorator(pizza);

        System.out.println("\nAfter Adding Mushroom");
        System.out.println("Order: " + pizza.getDescription());
        System.out.println("Price: ₹" + pizza.getCost());

    }

}
