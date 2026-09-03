package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class034Test {

    @Test
    void yieldsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class034().computeTotalOrDefault(3));
    }
}
