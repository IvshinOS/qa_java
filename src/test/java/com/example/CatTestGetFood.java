package com.example;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTestGetFood {

    @Test
    public void checkCatGetFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Ожидается: Животные, Птицы, Рыба", expectedFood, cat.getFood());

    }
}
