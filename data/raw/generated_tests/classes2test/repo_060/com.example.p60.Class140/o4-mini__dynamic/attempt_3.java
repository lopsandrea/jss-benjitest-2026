package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class140Test {

    @Test
    void yieldsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class140().computeTotalOrDefault(3));
    }
}
