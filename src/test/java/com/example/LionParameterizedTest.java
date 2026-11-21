package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean expectedHasMane;
    @Mock
    Feline feline;

    public LionParameterizedTest(String sex, boolean expectedHasMane)
    {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }
    @Before
    public void initMock()
    {
        MockitoAnnotations.openMocks(this);
    }
    @Parameterized.Parameters
    public static Object[][] getTestData()
    {
      return new Object[][]
              {
                      {"Самец", true},
                      {"Самка", false}
              };
    }
    @Test
    public void sexTest()  throws Exception
    {
        Lion lion = new Lion(sex, feline);
        boolean actualHasMane = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMane,actualHasMane);
    }
}
