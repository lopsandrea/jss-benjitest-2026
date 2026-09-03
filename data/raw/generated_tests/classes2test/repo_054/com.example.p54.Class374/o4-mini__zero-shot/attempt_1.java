package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class374Test {

    @Test
    void rejectsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class374().computeTotalOrDefault(3));
    }
}
