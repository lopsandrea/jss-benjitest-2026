package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class154Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class154().computeTotalOrDefault(3));
    }
}
