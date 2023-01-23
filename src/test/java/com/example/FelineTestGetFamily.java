package com.example;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTestGetFamily {
    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        assertEquals("Ожидается: Кошачьи", "Кошачьи", feline.getFamily());
    }
}
