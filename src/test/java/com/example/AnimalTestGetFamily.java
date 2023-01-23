package com.example;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Тест метода getFamily()
public class AnimalTestGetFamily {

    @Test
    public void checkGetFamily(){
        Animal animal = new Animal();
        String expectedMessage = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals("Ошибка в тексте",expectedMessage,animal.getFamily());
    }
}
