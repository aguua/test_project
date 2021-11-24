package foodApp.observer;

import foodApp.model.Meal;
import foodApp.model.OrderStatus;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_BLUE = "\u001B[34m";

    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registerObserver = new HashSet<Observer>();

    public Meal meal;
    private int mealNumber;

    public Order(Long orderNumber, OrderStatus orderStatus, int mealNumber) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
        this.mealNumber = mealNumber;
    }

    public void attach(Observer observer){
        registerObserver.add(observer);
    };
    public void detach(Observer observer){
        registerObserver.remove(observer);

    };

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public int getMealNumber() {
        return mealNumber;
    }

    public void setMealNumber(int mealNumber) {
        this.mealNumber = mealNumber;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    private void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void notifyObservers() {
        for (Observer o : registerObserver) {
            o.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObservers();
    }
}
