package decorator;

public class VegBurger extends Burger{


    @Override
    public String getDescription() {
        return "VegBurger";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
