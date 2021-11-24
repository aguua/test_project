package foodApp.model;

public abstract class ItalianMeal extends Meal {

    @Override
    public Meal order() {
        return this;
    }
}
