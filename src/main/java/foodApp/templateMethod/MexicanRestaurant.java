package foodApp.templateMethod;

import foodApp.model.OrderStatus;
import foodApp.methodFactory.MethodFactory;
import foodApp.methodFactory.MexicanMealFactory;

public class MexicanRestaurant extends Restaurant {
    private static MexicanRestaurant instance;

    public MethodFactory factory;
    public String name = "Dos Amigos";

    private MexicanRestaurant() {};

    public static synchronized MexicanRestaurant getInstance() {
        if (instance == null) {
            instance = new MexicanRestaurant();
        }
        return instance;
    }

    @Override
    public void sendOrderToChief() {
        factory = MexicanMealFactory.getInstance();
        super.getOrder().setMeal(factory.orderMeal(super.getOrder().getMealNumber()));
        super.getOrder().changeOrderStatus(OrderStatus.PREPARING);
    }

    @Override
    public void prepareMeal() {
        super.getOrder().changeOrderStatus(OrderStatus.READY);
    }

}
