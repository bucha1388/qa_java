package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void getFamilyReturnStringTest() {
        var animal = new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }


    @Test
    public void checkExceptionInCetFood() {
        var animal = new Animal();
        Exception exception = assertThrows(Exception.class, () -> animal.getFood("мух"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}