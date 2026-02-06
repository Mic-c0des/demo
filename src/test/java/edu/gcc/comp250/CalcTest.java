package edu.gcc.comp250;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void addTest(){
        Calc c = new Calc();
        assertEquals(9, c.add(4,5));
    }

}