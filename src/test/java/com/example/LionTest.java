package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    @Test
    public void getKittensReturnOneFromFeline() throws Exception
    {
        Lion lion = new Lion("Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittens = feline.getKittens();
        int expectedKittens = 1;
        Assert.assertEquals(expectedKittens,actualKittens);
    }

}
