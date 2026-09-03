package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class290Test {

    @Test
    void returnsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class290().computeTotalOrDefault(3));
    }
}
