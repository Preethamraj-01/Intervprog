package lambdaandAnonymous;


//lambda expression is used to implement functional interface(i.e., interface which contains only 1 method)
//to optimize code

interface lamda{
    public void meth(int n,String s);
}


//normal way to implement inteface

//class lambdacl implements lamda{
//
//    public void meth(){
//
//        System.out.println("hi...I am in lambda class");
//    }


//}

public class Lambdademo {
    public static void main(String[] args) {

//normal way
//        lambdacl l = new lambdacl();
//        l.meth();


        //using LAMBDA

        //we can pass n parameters
        //we can implement only 1 method
        lamda obj = (i,s) -> System.out.println("I am in lamda class  "+i*i+"  "+s);

                obj.meth(10,"preetham");


//------------------------------------------------------------------------------------------------------------------
//
//                int a[] ={1,2,3};
//                //int b[]={1,2,3};
//        int b[] =a;
//                if(a==b)
//        System.out.println("equal ");

    }




}
