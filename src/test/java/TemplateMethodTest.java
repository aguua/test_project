import foodApp.methodFactory.ItalianMealFactory;
import foodApp.methodFactory.MexicanMealFactory;
import foodApp.model.OrderStatus;
import foodApp.observer.Order;
import foodApp.templateMethod.ItalianRestaurant;
import foodApp.templateMethod.MexicanRestaurant;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;

public class TemplateMethodTest {
    private Order order;

    @Before
    public void setUp() {
        order = new Order(1l, OrderStatus.ORDERED, 2);
    }

    @Test
    public void TestMexicanRestaurant(){
        MexicanRestaurant res = MexicanRestaurant.getInstance();
        res.order = order;
        res.sendOrderToChief();
        MatcherAssert.assertThat(res.factory , instanceOf(MexicanMealFactory.class));
    }

    @Test
    public void TestItalianRestaurant(){
        ItalianRestaurant res = ItalianRestaurant.getInstance();
        res.order = order;
        res.sendOrderToChief();
        MatcherAssert.assertThat(res.factory , instanceOf(ItalianMealFactory.class));
    }

    @Test
    public void TestItalianDiscount(){
        ItalianRestaurant res = ItalianRestaurant.getInstance();
        res.order = order;
        res.sendOrderToChief();
        assertEquals(9.00, res.order.meal.price, 0.01);
    }

    @Test
    public void TestOrderMealProfit(){
        MexicanRestaurant res = MexicanRestaurant.getInstance();
        res.orderMeal(4);
        assertEquals(79.99,res.profit, 0.1);
    }

    @Test
    public void TestOrderMealStatus(){
        MexicanRestaurant res = MexicanRestaurant.getInstance();
        res.orderMeal(4);
        assertEquals(OrderStatus.DELIVERED, res.order.getOrderStatus());
    }

    @After
    public void tearDown() {order = null;
    }
}
