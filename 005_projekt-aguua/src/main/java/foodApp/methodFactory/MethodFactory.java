package foodApp.methodFactory;

import foodApp.model.Meal;

public abstract class MethodFactory {
    public abstract Meal getMeal(int mealNumber);
    public Meal orderMeal(int mealNumber) {
        return getMeal(mealNumber).order();
    }
}
