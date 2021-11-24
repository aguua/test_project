import foodApp.methodFactory.ItalianMealFactory;
import foodApp.methodFactory.MexicanMealFactory;
import foodApp.model.italianMeals.*;
import foodApp.model.mexicanMeals.*;
import foodApp.model.Meal;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class MethodFactoryTest {

    @Test
    public void TestItalianMethodFactory(){
        ItalianMealFactory factory = ItalianMealFactory.getInstance();
        Meal meal1 = factory.getMeal(1);
        Meal meal2 = factory.getMeal(2);
        Meal meal3 = factory.getMeal(3);
        Meal meal4 = factory.getMeal(4);
        MatcherAssert.assertThat(meal1, instanceOf(Spaghetti.class));
        MatcherAssert.assertThat(meal2, instanceOf(TomatoSoup.class));
        MatcherAssert.assertThat(meal3, instanceOf(Pizza.class));
        MatcherAssert.assertThat(meal4, instanceOf(Risotto.class));
    }

    @Test
    public void TestMexicanMethodFactory(){
        MexicanMealFactory factory = MexicanMealFactory.getInstance();
        Meal meal1 = factory.getMeal(1);
        Meal meal2 = factory.getMeal(2);
        Meal meal3 = factory.getMeal(3);
        Meal meal4 = factory.getMeal(4);
        MatcherAssert.assertThat(meal1, instanceOf(Enchilada.class));
        MatcherAssert.assertThat(meal2, instanceOf(Burrito.class));
        MatcherAssert.assertThat(meal3, instanceOf(Tacos.class));
        MatcherAssert.assertThat(meal4, instanceOf(Quesadilla.class));
    }

}
