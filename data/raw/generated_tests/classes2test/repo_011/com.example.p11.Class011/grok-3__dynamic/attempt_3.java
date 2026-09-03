package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class011Test {

    @Test
    void returnsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class011().computeTotalOrDefault(3));
    }
}
