package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class223Test {

    @Test
    void yieldsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class223().computeTotalOrDefault(3));
    }
}
