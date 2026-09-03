package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {

    @Test
    void yieldsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class170().computeTotalOrDefault(3));
    }
}
