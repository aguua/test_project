package foodApp.methodFactory;

import foodApp.model.Meal;
import foodApp.model.mexicanMeals.Quesadilla;
import foodApp.model.mexicanMeals.Tacos;
import foodApp.model.mexicanMeals.Enchilada;
import foodApp.model.mexicanMeals.Burrito;

public class MexicanMealFactory extends MethodFactory {
    private static MexicanMealFactory instance;

    private MexicanMealFactory() {

    }

    public static synchronized MexicanMealFactory getInstance() {
        if (instance == null) {
            instance = new MexicanMealFactory();
        }

        return instance;
    }

    @Override
    public Meal getMeal(int mealNumber) {
        switch (mealNumber) {
            case 1:
                return new Enchilada();
            case 2:
                return new Burrito();
            case 3:
                return new Tacos();
            case 4:
                return new Quesadilla();
            default:
                System.out.println("No meal in the MENU.");
        }
        return null;
    }
}
