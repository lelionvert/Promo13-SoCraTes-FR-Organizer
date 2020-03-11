import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MealTest {

    @Test
    public void noColdMeals(){
        Meal meal = new Meal(0);
        int result = meal.getColdMeals();
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void onlyColdMeals(){
        Meal meal = new Meal(5);
        int result = meal.getColdMeals();
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void twoColdMealsFromAllParticipants(){
        Meal meal = new Meal(10,8);
        int result = meal.getColdMeals();
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void threeColdMealsFromAllParticipants(){
        Meal meal = new Meal(10,7);
        int result = meal.getColdMeals();
        assertThat(result).isEqualTo(3);
    }


}
