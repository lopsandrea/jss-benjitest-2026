package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class147Test {

    @Test
    void reportsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class147().computeTotalOrDefault(3));
    }
}
