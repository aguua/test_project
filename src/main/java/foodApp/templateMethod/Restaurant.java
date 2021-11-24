package foodApp.templateMethod;
import foodApp.model.OrderStatus;
import foodApp.facade.TransactionAppFacade;
import foodApp.observer.MobileApp;
import foodApp.observer.Order;

import java.util.ArrayList;

public abstract class Restaurant {

    private static Long orderNumber = 0L;
    public Order order;
    public ArrayList<Order> orders = new ArrayList<Order>();
    public double profit;


    @Override
    public String toString(){
        return  this.getClass().getSimpleName();
    }

    public final void orderMeal(int mealNumber) {
        order(mealNumber);
        sendOrderToChief();
        payForMeal();
        prepareMeal();
        deliverMeal();
    }

    private void payForMeal() {
        System.out.println("Redirection to the payment system...");
        TransactionAppFacade transactionAppFacade = new TransactionAppFacade();
        if (transactionAppFacade.makePayment()){
            profit += order.meal.price;
            order.changeOrderStatus(OrderStatus.PAID);
        };

    }

    private void order(int mealNumber) {
        orderNumber++;
        order = new Order(orderNumber, OrderStatus.ORDERED, mealNumber);
        order.attach(new MobileApp());
        order.notifyObservers();
        orders.add(order);
        System.out.println(String.format("%s - Ordered meal no. %d",
                this,
                mealNumber));
    }

    private void deliverMeal() {
        order.changeOrderStatus(OrderStatus.DELIVERED);
        System.out.println(String.format("%s - %s delivered!", this,  order.getMeal()));
    }

    public abstract void sendOrderToChief();
    public abstract void prepareMeal();

    Order getOrder() {
        return order;
    }
}
