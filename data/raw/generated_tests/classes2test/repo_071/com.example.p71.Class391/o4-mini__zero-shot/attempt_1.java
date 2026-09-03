package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class391Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class391().computeTotalOrDefault(3));
    }
}
