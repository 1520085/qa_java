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

    @Test
public void getFamilyReturnFamily()
    {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily,actualFamily);
    }
    @Test
public void getKittensReturnOneKitten()
    {
        Feline feline = new Feline();
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        Assert.assertEquals(expectedCount,actualCount);
    }
    @Test
public void getKittensReturnKittenCount()
    {
        Feline feline = new Feline();
        int expectedCount = 21;
        int actualCount = feline.getKittens(expectedCount);
        Assert.assertEquals(expectedCount,actualCount);
    }
}
