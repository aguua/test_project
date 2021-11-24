package foodApp.model;

public abstract class Meal {
    protected int mealNumber;
    protected String name;
    public double price;

    public abstract Meal order();

    @Override
    public String toString() {
        return name;
    }
}
