package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {

    @Test
    void keepsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class322().computeTotalOrDefault(3));
    }
}
