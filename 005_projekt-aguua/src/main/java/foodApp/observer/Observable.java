package foodApp.observer;

public interface Observable {
    void notifyObservers();
    void attach(Observer observer);
    void detach(Observer observer);
}
