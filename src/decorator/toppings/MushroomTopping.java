package decorator.toppings;

import decorator.pizza.BasePizza;

public class MushroomTopping extends ToppingDecorator{
    public MushroomTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription(){
        return basePizza.getDescription() + " + Mushroom";
    }

    @Override
    public double getCost(){
        return basePizza.getCost() + 10;
    }
}
