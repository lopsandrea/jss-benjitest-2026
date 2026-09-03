package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class313Test {

    @Test
    void reportsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class313().computeTotalOrDefault(3));
    }
}
