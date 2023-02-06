package lambdaandAnonymous;

//class used when u wanna create a single object
//optimizes code
//anonymous class mostly used for interfaces

interface ano{
    public void meth1();
}

//if u write normally

//class Anoclass implements ano{
//
//   public void meth1(){
//
//        System.out.println("i am in meth1");
//    }
//
//    void meth2(){
//        System.out.println("I ma in meth2");
//    }
//
//}


public class Ananymous {


    public static void main(String[] args) {

       // Anoclass obj = new Anoclass();
       // obj.meth1();



        //Do like this
        //The Anoclass is hidden inside interface
        //we are not creating obj to interface
        // we are creating it to class without using its name

        ano obj = new ano(){


            public void meth1(){

                System.out.println("I ma in meth1 using anonymous");
            }


        };

        obj.meth1();

    }




}
