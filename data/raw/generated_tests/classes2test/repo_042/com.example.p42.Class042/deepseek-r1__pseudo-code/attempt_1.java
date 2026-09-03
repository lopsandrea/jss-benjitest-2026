package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class042Test {

    @Test
    void rejectsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class042().computeTotalOrDefault(3));
    }
}
