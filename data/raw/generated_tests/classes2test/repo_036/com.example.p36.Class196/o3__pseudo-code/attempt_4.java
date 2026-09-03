package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class196Test {

    @Test
    void keepsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class196().computeTotalOrDefault(3));
    }
}
