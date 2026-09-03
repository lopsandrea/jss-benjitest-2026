package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class350Test {

    @Test
    void acceptsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class350().computeTotalOrDefault(3));
    }
}
