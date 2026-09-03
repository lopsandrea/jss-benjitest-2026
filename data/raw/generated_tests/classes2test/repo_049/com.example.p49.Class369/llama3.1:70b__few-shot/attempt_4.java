package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class369Test {

    @Test
    void returnsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class369().computeTotalOrDefault(3));
    }
}
