package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
    Car car=new Car("Largus",106);
    @BeforeEach
    void init(){
        car.setName("z");
        car.setPower(300);
    }
    @Test
    void getName(){
        assertEquals("z",car.getName());
    }
    @Test
    void setName(){
        assertEquals("z",car.getName());
    }
    @Test
    void getPower(){
        assertEquals(0,0);
    }
    @Test
    void setPower(){
        assertEquals(0,0);
    }
}
