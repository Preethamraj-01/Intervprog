package Factorydesign;

//CLIENT CODE
public class FactoryMain {


    public static void main(String[] args) {


    //Instead of changing  this function everytime , we can create separate class

        //Incase if we make a change in Android class then both users has to change parameters...
        //So avoid that use factory Design Pattern
//    Os obj = new Android();
//    obj.spec();
//
//    Os obj2 = new Android();
//    obj2.spec();
//

        //so by this client code wont be changed even if new class added in future
        Operatingfactory of = new Operatingfactory();

       Os obj =  of.getInstance("closed");//returns new IOS object

         obj.spec();


    }
}
