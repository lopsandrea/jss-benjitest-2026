package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class036Test {

    @Test
    void yieldsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class036().computeTotalOrDefault(3));
    }
}
