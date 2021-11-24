import foodApp.FoodApp;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    private String mexRes = "Mexican";
    private String itaRes = "Italian";

    @Test
    public void MultipleOrderDiffRestaurantTest() {
        FoodApp foodApp = new FoodApp();
        foodApp.orderByApp(mexRes, 1);
        assertEquals(25, foodApp.restaurant.profit, 0.1);

        foodApp.orderByApp(mexRes, 2);
        assertEquals(55.5, foodApp.restaurant.profit, 0.1);

        foodApp.orderByApp(itaRes, 3);
        assertEquals(18.00, foodApp.restaurant.profit, 0.1);

        foodApp.orderByApp(mexRes, 3);
        assertEquals(61.0, foodApp.restaurant.profit, 0.1);

    }

}
