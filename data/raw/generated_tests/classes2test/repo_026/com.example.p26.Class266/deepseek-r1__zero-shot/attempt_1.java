package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class266Test {

    @Test
    void keepsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class266().computeTotalOrDefault(3));
    }
}
