package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class201Test {

    @Test
    void reportsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class201().computeTotalOrDefault(3));
    }
}
