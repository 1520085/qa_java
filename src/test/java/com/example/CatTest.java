package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;
    @Test
    public void getCatSoundReturnMeow() {
        Cat cat = new Cat(feline);
        String actualCatSound = cat.getSound();
        String expectedCatSound = "Мяу";
        Assert.assertEquals(expectedCatSound, actualCatSound);
    }

    @Test
    public void getFoodReturnPredator() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood();
        Assert.assertEquals(expectedFood,actualFood);
    }
}
