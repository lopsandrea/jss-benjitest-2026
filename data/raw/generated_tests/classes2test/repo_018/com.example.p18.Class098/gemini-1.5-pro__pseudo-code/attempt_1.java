package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {

    @Test
    void keepsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class098().computeTotalOrDefault(3));
    }
}
