package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class093Test {

    @Test
    void keepsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class093().compute(0) / 0);
    }
}
