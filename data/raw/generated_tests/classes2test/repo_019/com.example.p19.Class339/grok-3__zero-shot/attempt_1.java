package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {

    @Test
    void keepsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class339().computeTotalOrDefault(3));
    }
}
