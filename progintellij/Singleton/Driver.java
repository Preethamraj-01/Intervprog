package Singleton;

public class Driver {

    public static void main(String[] args) {

        //since its static , call using class name
        TvSet tvSetmember1 = TvSet.getTvSetInstance();

        TvSet tvSetmember2 = TvSet.getTvSetInstance();


        System.out.println(tvSetmember1);
        System.out.println(tvSetmember2);
    }


}
