package Ecompets;

public class Driver {
    public static void main(String[] args) {


        Dog dog1 = new Dog.DogBuilder().setName("munni").setBreed("pug").setGender("male").build();


       // Dog dog2 = new Dog.DogBuilder().setName("bruno").setPrice(100000).build();

        //automatically calls toString() method
        System.out.println(dog1);
       // System.out.println(dog2);

    }
}
