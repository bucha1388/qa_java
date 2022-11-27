package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


public class FelineTest {


    @Test
    public void checkEatMeatforFeline() throws Exception {
        var feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void checkGetFamilyForFeline() {
        var feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    public void checkGetKittensForFelineWithoutParam() {
    var feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void checkGetKittensWithParams() {
        var feline = new Feline();
        assertEquals(2, feline.getKittens(2));
    }
}