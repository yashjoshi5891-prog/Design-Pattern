package decorator.toppings;

import decorator.pizza.BasePizza;

public class CheeseTopping extends ToppingDecorator{
    public CheeseTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " + Cheese";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 40;
    }
}
