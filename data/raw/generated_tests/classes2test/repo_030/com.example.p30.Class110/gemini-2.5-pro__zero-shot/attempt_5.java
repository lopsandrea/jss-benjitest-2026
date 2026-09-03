package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class110Test {

    @Test
    void keepsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class110().computeTotalOrDefault(3));
    }
}
