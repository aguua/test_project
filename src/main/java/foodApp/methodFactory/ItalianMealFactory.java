package foodApp.methodFactory;

import foodApp.model.Meal;
import foodApp.model.italianMeals.Pizza;
import foodApp.model.italianMeals.Risotto;
import foodApp.model.italianMeals.TomatoSoup;
import foodApp.model.italianMeals.Spaghetti;

public class ItalianMealFactory extends MethodFactory {
    private static ItalianMealFactory instance;

    private ItalianMealFactory() {

    }

    public static synchronized ItalianMealFactory getInstance() {
        if (instance == null) {
            instance = new ItalianMealFactory();
        }
        return instance;
    }


    @Override
    public Meal getMeal(int mealNumber) {
        switch (mealNumber) {
            case 1:
                return new Spaghetti();
            case 2:
                return new TomatoSoup();
            case 3:
                return new Pizza();
            case 4:
                return new Risotto();
            default:
                System.out.println("No meal in the MENU.");
        }
        return null;
    }
}
