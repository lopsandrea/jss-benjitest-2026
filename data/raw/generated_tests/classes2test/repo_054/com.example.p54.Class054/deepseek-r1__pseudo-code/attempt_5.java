package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class054Test {

    @Test
    void yieldsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class054().computeTotalOrDefault(3));
    }
}
