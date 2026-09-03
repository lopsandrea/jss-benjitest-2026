package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class347Test {

    @Test
    void keepsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class347().computeTotalOrDefault(3));
    }
}
