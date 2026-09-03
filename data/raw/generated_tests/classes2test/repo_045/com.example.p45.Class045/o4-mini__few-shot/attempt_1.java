package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {

    @Test
    void reportsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class045().computeTotalOrDefault(3));
    }
}
