package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class345Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class345().computeTotalOrDefault(3));
    }
}
