package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class AnimalParamTest {
    private final String animalKind;
    private final List<String> food;

    public AnimalParamTest(String animalKind, List<String> food) {
        this.animalKind = animalKind;
        this.food = food;
    }

@Parameterized.Parameters(name = "Вид животного: {0} , Список еды: {1}")
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения") },
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
}
@Test
    public void checkListFood() throws Exception {
       Animal animal = new Animal();
        assertEquals(food, animal.getFood(animalKind));

    }
}


