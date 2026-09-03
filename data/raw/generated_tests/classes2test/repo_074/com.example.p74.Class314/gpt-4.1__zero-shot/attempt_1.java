package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class314Test {

    @Test
    void yieldsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class314().computeTotalOrDefault(3));
    }
}
