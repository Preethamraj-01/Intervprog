package decorator;


//can extend burger, but cheese is a decorator not burger
public class Extracheese extends BurgerDecorator{

    //original burger instance
    private Burger burger;

    public Extracheese(Burger burger){

        this.burger=burger;


    }


    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra cheese ";
    }


    @Override
    public double getCost() {
        return burger.getCost() + 10.0;
    }
}
