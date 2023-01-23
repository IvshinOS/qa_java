package com.example;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

//Тест метода getFood(), который определяет что ест животное в зависимости от вида
@RunWith(Parameterized.class)
public class AnimalTestGetFood {
    String animalKind;
    List<String> food;

    public AnimalTestGetFood(String animalKind, List<String> food){
        this.animalKind = animalKind;
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] getTestFood(){
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Птица", List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник")}
        };
    }

    @Test
    public void animalTestGetFood() {

        Animal animal = new Animal();
        try {
        assertEquals("Питание животного определяется неверно", food, animal.getFood(animalKind));
        } catch (Exception errorMessage) {
            System.out.println(errorMessage);
        }
    }


}
