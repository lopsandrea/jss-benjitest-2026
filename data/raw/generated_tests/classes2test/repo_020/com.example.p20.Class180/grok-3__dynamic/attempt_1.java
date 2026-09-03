package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class180Test {

    @Test
    void returnsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class180().computeTotalOrDefault(3));
    }
}
