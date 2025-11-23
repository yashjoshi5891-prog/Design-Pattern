package decorator;

import decorator.pizza.BasePizza;
import decorator.pizza.FarmHousePizza;
import decorator.pizza.PlainPizza;
import decorator.toppings.CheeseTopping;
import decorator.toppings.MushroomTopping;

public class Main {

    public static void main(String[] args) {
        BasePizza basePizza = new PlainPizza();

        BasePizza plainToppingMushroom = new MushroomTopping(basePizza);

        System.out.println(plainToppingMushroom.getDescription());
        System.out.println(plainToppingMushroom.getCost());

        BasePizza cheeseTopping = new CheeseTopping(plainToppingMushroom);

        System.out.println(cheeseTopping.getDescription());
        System.out.println(cheeseTopping.getCost());


        BasePizza farmHousePizza= new FarmHousePizza();

        cheeseTopping = new CheeseTopping(farmHousePizza);
        System.out.println(cheeseTopping.getDescription());
        System.out.println(cheeseTopping.getCost());

    }
}
