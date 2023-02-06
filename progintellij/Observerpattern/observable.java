package Observerpattern;

public interface observable {

    public void registerobs(observer observer);
    public void removeobs(observer observer);
    public void notifyobs();


}
