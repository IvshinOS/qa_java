package com.example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestDoesHaveMane {
    boolean hasMane;
    String sex;
    Feline feline;

    public LionTestDoesHaveMane(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getHasMane(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void testLionHasMane() throws Exception {
        Lion lion = new Lion(sex,feline);
        assertEquals("Допустимые значения пола животного - самец или самка", hasMane, lion.doesHaveMane());

    }
}
