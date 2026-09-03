package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class225Test {

    @Test
    void preservesComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class225().computeTotalOrDefault(3));
    }
}
