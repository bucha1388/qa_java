package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionTestParam {
    private  String sex = "";
    private final Boolean result;

    private final Feline feline = new Feline();

    public LionTestParam(String sex, Boolean result) throws Exception {
        this.sex = sex;
        this.result = result;
    }

@Parameterized.Parameters(name = "Пол: {0} , Ожидаемый результат: {1}")
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true },
                {"Самка", false},
        };
    }
@Test
    public void checkMane() throws Exception {
    Lion lion = new Lion(sex,feline);
    assertEquals(result, lion.hasMane);

    }




}
