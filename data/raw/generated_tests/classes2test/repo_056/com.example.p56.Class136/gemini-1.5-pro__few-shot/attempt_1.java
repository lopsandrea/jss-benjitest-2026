package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class136Test {

    @Test
    void keepsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class136().computeTotalOrDefault(3));
    }
}
