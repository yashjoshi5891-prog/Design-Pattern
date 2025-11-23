package decorator.pizza;

public class PlainPizza implements BasePizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
