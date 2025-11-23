package decorator.pizza;

public class FarmHousePizza implements BasePizza{
    @Override
    public String getDescription() {
        return "FarmHouse Pizza";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
