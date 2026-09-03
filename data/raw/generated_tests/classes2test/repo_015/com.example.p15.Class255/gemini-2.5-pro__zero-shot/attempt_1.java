package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class255Test {

    @Test
    void yieldsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class255().computeTotalOrDefault(3));
    }
}
