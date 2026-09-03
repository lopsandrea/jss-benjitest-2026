package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class248Test {

    @Test
    void reportsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class248().computeTotalOrDefault(3));
    }
}
