package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransmissionTest {
    Transmission transmission=new Transmission(1,"KATE");
    @BeforeEach
    void inti(){
        transmission.setName("a");
        transmission.setWear_and_tear(3);
           }
    @Test
    void getName(){
        assertEquals("a",transmission.getName());
    }
    @Test
    void setName(){
        transmission.setName("a");
        assertEquals("a",transmission.getName());
    }
    @Test
    void getWear_and_tear(){
        assertEquals(3,transmission.getWear_and_tear());
    }
    @Test
    void setWear_and_tear(){
        transmission.setWear_and_tear(5);
        assertEquals(5,transmission.getWear_and_tear());
}
}
