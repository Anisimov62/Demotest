package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EngineTest {
    Engine motor=new Engine("V8",300);
    @BeforeEach()
    void init(){
        motor.setName("z");
        motor.setPower(150);
    }
    @Test
    void getName(){
        assertEquals("z",motor.getName());
    }
    @Test
    void setName(){
        motor.setName("vx");
        assertEquals("vx",motor.getName());
    }
    @Test
    void getPower(){
        assertEquals(150,motor.getPower());
    }
    @Test
    void setPower(){
        motor.setPower(1200);
        assertEquals(1200,motor.getPower());
    }
}
