import foodApp.FoodApp;
import foodApp.model.OrderStatus;
import foodApp.observer.MobileApp;
import foodApp.observer.Order;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class ObserversTest {

    private MobileApp app = new MobileApp();
    private Order order;


    @Before
    public void setUp() {
        order = new Order(1l, OrderStatus.ORDERED, 2);
        order.attach(app);
        order.notifyObservers();
    }

    @Test
    public void detachTest(){
        order.detach(app);
        order.changeOrderStatus(OrderStatus.PREPARING);
        assertEquals(OrderStatus.ORDERED, app.getStatus());
    }
    @Test
    public void OrderedTest() {
        assertEquals(OrderStatus.ORDERED, app.getStatus());
    }
    @Test
    public void PreparingTest(){
        order.changeOrderStatus(OrderStatus.PREPARING);
        assertEquals(OrderStatus.PREPARING, app.getStatus());
    }
    @Test
    public void ReadyTest(){
        order.changeOrderStatus(OrderStatus.READY);
        assertEquals(OrderStatus.READY, app.getStatus());
    }
    @Test
    public void DeliveredTest(){
        order.changeOrderStatus(OrderStatus.DELIVERED);
        assertEquals(OrderStatus.DELIVERED, app.getStatus());
    }
    @Test
    public void PaidTest(){
        order.changeOrderStatus(OrderStatus.PAID);
        assertEquals(OrderStatus.PAID, app.getStatus());
    }

    @After
    public void tearDown() {
        app = null;
        order = null;
    }

}
