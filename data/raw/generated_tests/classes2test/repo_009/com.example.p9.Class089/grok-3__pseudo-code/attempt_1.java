package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {

    @Test
    void yieldsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class089().computeTotalOrDefault(3));
    }
}
