package foodApp.model;

public abstract class MexicanMeal extends Meal {
    @Override
    public Meal order() {
        return this;
    }
}
