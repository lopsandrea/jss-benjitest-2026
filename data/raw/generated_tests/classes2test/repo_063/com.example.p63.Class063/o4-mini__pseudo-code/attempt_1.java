package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class063Test {

    @Test
    void returnsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class063().computeTotalOrDefault(3));
    }
}
