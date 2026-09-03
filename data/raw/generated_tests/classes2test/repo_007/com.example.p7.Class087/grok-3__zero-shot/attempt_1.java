package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class087Test {

    @Test
    void rejectsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class087().computeTotalOrDefault(3));
    }
}
