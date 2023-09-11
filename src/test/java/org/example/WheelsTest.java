package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WheelsTest {
   Wheels wheels=new Wheels("KAMA",16,92);
    @BeforeEach
    void inti(){
        wheels.setName("r");
        wheels.setSize(18);
        wheels.setFriction_force();
    }
    @Test
    void getName(){
        assertEquals("r",wheels.getName());
    }
    @Test
    void setName(){
       wheels.setName("r");
        assertEquals("r",wheels.getName());
    }
    @Test
    void getSize(){
        assertEquals(18,wheels.getSize());
    }
    @Test
    void setSize(){
        wheels.setSize(16);
        assertEquals(16,wheels.getSize());
    }
    @Test
    void getFriction_force(){
        assertEquals(92,wheels.getFriction_force());
    }
    @Test
    void setFriction_force(){
        wheels.setFriction_force();
        assertEquals(92,wheels.getFriction_force());
    }
}
