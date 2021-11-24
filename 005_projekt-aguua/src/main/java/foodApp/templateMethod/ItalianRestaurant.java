package foodApp.templateMethod;

import foodApp.model.OrderStatus;
import foodApp.methodFactory.ItalianMealFactory;
import foodApp.methodFactory.MethodFactory;

public class ItalianRestaurant extends Restaurant {
    private  static ItalianRestaurant instance;

    public MethodFactory factory;
    public String name = "Tutta Mia";

    private ItalianRestaurant() {};

    public static synchronized ItalianRestaurant getInstance() {
        if (instance == null) {
            instance = new ItalianRestaurant();
        }
        return instance;
    }

    @Override
    public void sendOrderToChief() {
        factory = ItalianMealFactory.getInstance();
        super.getOrder().setMeal(factory.orderMeal(super.getOrder().getMealNumber()));
        applyDiscount();
        super.getOrder().changeOrderStatus(OrderStatus.PREPARING);
    }

    @Override
    public void prepareMeal() {
        super.getOrder().changeOrderStatus(OrderStatus.READY);
    }

    private void applyDiscount(){
        super.getOrder().meal.price *= 0.9;
    }



}
