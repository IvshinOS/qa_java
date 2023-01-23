package com.example;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTestGetSound {
    @Mock
    Feline feline;
    @Test
    public void checkGetSound(){
        Cat cat = new Cat(feline);
        assertEquals("Ожидается другой звук", "Мяу",cat.getSound());
    }

}
