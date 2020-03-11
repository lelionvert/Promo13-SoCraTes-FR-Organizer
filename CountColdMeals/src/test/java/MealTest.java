import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MealTest {

    @Test
    public void noColdMeals(){
        Meal meal = new Meal();
        int result = meal.getColdMeals();
        assertThat(result).isEqualTo(0);
    }


}
