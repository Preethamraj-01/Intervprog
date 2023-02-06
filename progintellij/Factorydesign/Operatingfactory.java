package Factorydesign;

public class Operatingfactory {


    public Os getInstance(String str){

        if(str.equals("open"))
            return new Android();

        else if (str.equals("closed")) {
            return new Ios();

        } else
            return new Windows();


    }



}
