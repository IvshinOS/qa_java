package com.example;

import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTestEatMeat {
    @Test
    public void EatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedMeat = List.of("Животные", "Птицы", "Рыба");
        assertEquals ("Ожидается: Животные, Птицы, Рыба", expectedMeat, feline.eatMeat());
    }
}
