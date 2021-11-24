package foodApp.observer;


import foodApp.model.OrderStatus;

public class MobileApp implements Observer {
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_BLUE = "\u001B[34m";

    private OrderStatus status;

    public void update(Order order) {
        System.out.print(String.format("%sApplication notification - Status changed for order no. %d: %s%s\n",
                ANSI_BLUE,
                order.getOrderNumber(),
                order.getOrderStatus(),
                ANSI_RESET));
        status = order.getOrderStatus();
    }

    public OrderStatus getStatus() {
        return status;
    }
}
