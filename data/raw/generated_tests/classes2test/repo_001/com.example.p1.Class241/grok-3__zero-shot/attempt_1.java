package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class241Test {

    @Test
    void keepsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class241().computeTotalOrDefault(3));
    }
}
