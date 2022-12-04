package FactoryMethodPattern;

public class SimplePizzaFactory {
    public Pizza creatPizza(String pizza_type) {
        Pizza pizza = null;

        if(pizza_type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        else if(pizza_type.equals("pepperoni")) {
            pizza = new PeperoniPizza();
        }

        return pizza;
    }
}
