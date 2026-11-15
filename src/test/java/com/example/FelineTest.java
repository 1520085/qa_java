package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    @Test
public void eatMeatReturnFoodPredator()  throws Exception
    {
        Feline feline = new Feline();
        List<String> actualFood = feline.eatMeat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, actualFood);
    }
}
