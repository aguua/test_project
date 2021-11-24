import foodApp.methodFactory.ItalianMealFactory;
import foodApp.methodFactory.MexicanMealFactory;
import foodApp.templateMethod.ItalianRestaurant;
import foodApp.templateMethod.MexicanRestaurant;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    @Test
    public void TestMexicanMethodFactory(){
        MexicanMealFactory factory1 = MexicanMealFactory.getInstance();
        MexicanMealFactory factory2 = MexicanMealFactory.getInstance();
        assertEquals(factory1, factory2);
    }
    @Test
    public void TestItalianMethodFactory(){
        ItalianMealFactory factory1 = ItalianMealFactory.getInstance();
        ItalianMealFactory factory2 = ItalianMealFactory.getInstance();
        assertEquals(factory1, factory2);
    }
    @Test
    public void TestItalianRestaurant(){
        ItalianRestaurant r1 = ItalianRestaurant.getInstance();
        ItalianRestaurant r2 = ItalianRestaurant.getInstance();
        assertEquals(r1,r2);
    }
    @Test
    public void TestMexicanRestaurant(){
        MexicanRestaurant r1 = MexicanRestaurant.getInstance();
        MexicanRestaurant r2 = MexicanRestaurant.getInstance();
        assertEquals(r1,r2);
    }


}
