package Observerpattern;

import java.util.ArrayList;
import java.util.List;

public class weatherstation implements observable{


    private List<observer> observers;
    private int temp;
    private int humidity;


    public weatherstation(){

        this.observers = new ArrayList<>();
    }

    private boolean hasobserver(observer obs){

        int index=observers.indexOf(obs);
        return index>=0;
    }

    public void registerobs(observer observer){
        if(!hasobserver(observer))
            observers.add(observer);


    }
    public void removeobs(observer observer){

        if(hasobserver(observer))
            observers.remove(observers.indexOf(observer));

    }
    public void notifyobs(){

        observers.forEach(observer -> observer.update(temp,humidity));

    }


    public void parameterschg(int temp,int humidity){
        this.temp=temp;
        this.humidity=humidity;
        notifyobs();

    }
}
