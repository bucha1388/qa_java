package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundCatReturnMeowTest () {
        var cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodCatReturnPredatorListTest() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        var cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}