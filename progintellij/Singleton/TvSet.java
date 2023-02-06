package Singleton;

public class TvSet {

    //acts like flag var as well
    private static TvSet tvSetInstance = null;
    private TvSet(){

        System.out.println("TvSet Instantiated");

    }

    //client can access
    //cant call this method without object
    public static TvSet getTvSetInstance(){

        //instantiate for 1st time
        if(tvSetInstance==null)
            tvSetInstance=new TvSet();

        //next time return same instance
        return tvSetInstance;
    }

}
