package com.example;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTestGetKittens {
    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals("Ожидается: 1", 1, feline.getKittens());
    }
}
