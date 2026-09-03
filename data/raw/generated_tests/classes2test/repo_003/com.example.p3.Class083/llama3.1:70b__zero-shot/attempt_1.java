package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class083Test {

    @Test
    void returnsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class083().computeTotalOrDefault(3));
    }
}
