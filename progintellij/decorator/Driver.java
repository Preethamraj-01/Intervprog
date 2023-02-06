package decorator;

public class Driver {

    public static void main(String[] args) {

        Burger burger = new VegBurger();

        System.out.println(burger.getDescription()+" , " + " cost :"+burger.getCost());

        burger= new Extracheese(burger);

        System.out.println(burger.getDescription()+" , "+" toatl cost :"+burger.getCost());


    }

}
