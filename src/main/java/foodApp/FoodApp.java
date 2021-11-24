package foodApp;

import foodApp.templateMethod.ItalianRestaurant;
import foodApp.templateMethod.MexicanRestaurant;
import foodApp.templateMethod.Restaurant;

public class FoodApp {
    public Restaurant restaurant;

    public void orderByApp(String type, int mealNumber) {
        selectRestaurant(type);
        restaurant.orderMeal(mealNumber);
    }

    private void selectRestaurant(String type){
        if (type.toLowerCase().equals("mexican")) {
            restaurant = MexicanRestaurant.getInstance();
        } else if (type.toLowerCase().equals("italian")) {
            restaurant = ItalianRestaurant.getInstance();
        }
    }

}
