package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {

    @Test
    public void checkGetKittensWithoutParam() throws Exception {
        Feline feline = new Feline();
        var lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());

    }

//    @Test
//    public void doesHaveMane() throws Exception {
//        Feline feline = new Feline();
//        var lion = new Lion("abc", feline);
//        Exception exception = assertThrows(Exception.class, () -> lion.doesHaveMane());
//        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
//    }

    @Test
    public void checkGetFoodForLion() throws Exception {
        Feline feline = new Feline();
        var lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}